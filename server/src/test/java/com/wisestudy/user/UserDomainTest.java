package com.wisestudy.user;

import com.wisestudy.user.domain.Users;
import com.wisestudy.user.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDomainTest {
    @Autowired
    UserRepository repository;

//    @Test
//    public void insertUserOne() {
//        User user = new User();
//        user.setName("TestUser");
//        user.setEmail("test@test.com");
//        user.setPassword("test1234");
//        user.setBirth(LocalDateTime.parse(
//                LocalDateTime.now()
//                        .format(DateTimeFormatter.ofPattern("YYYY-mm-dd H:i:s"))
//        ));
//        user.setCellPhone("010-1234-5678");
//        user.setGender(Gender.M);
//
//        User userResult = repository.save(user);
//        System.out.println("insertUserOne(): " + userResult.toString());
//    }

    @Test
    public void selectUserOne() {
        Users users = repository.findAll();
        assertNotNull(users);
    }
}
