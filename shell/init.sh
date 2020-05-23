#!/bin/bash

# Start MySQL Server
/usr/sbin/mysqld &

# Wait for started MySQL Server
sleep_time=0
while [[ -z ${mysql_process} ]]; do
  mysql_process=`cat /var/log/mysqld.log | grep "port: 3306  MySQL Community Server (GPL)"`
  sleep 1
  sleep_time=$(($sleep_time+1))
done
echo "Started MySQL Server with sleep ${sleep_time}s"

# Initialize MySQL accounts
echo "USE mysql; SET PASSWORD FOR 'root'@'localhost' = PASSWORD('admin');" | mysql --default-character-set=utf8
echo "Changed password of 'root'@'localhost'"

mysql -u "root" -p"admin" -D "mysql" -se "CREATE USER 'root'@'%' IDENTIFIED BY 'admin';"
mysql -u "root" -p"admin" -D "mysql" -se "GRANT ALL PRIVILEGES ON *.* to 'root'@'%';"
echo "Created root account for connection from outside"
echo "Initialized MySQL account: 'root'@'%', 'root'@'localhost'"

# Start SSH
/usr/sbin/sshd
echo "Started SSH Server"

# Start Nginx
echo "Starting Nginx Server"
/usr/sbin/nginx -g "daemon off;"
