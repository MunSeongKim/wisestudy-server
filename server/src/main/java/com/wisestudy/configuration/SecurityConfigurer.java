package com.wisestudy.configuration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter {
    private static final Log logger = LogFactory
            .getLog(SecurityConfigurer.class);


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        logger.info("Security Config.......");
    }
}
