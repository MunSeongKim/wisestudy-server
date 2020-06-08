package com.wisestudy.test;

import com.wisestudy.test.controller.TestController;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RunWith(SpringRunner.class)
@RestClientTest(TestController.class)
public class TestControllerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    private MockRestServiceServer server;

    @Test
    public void helloApiTest() {


    }
}
