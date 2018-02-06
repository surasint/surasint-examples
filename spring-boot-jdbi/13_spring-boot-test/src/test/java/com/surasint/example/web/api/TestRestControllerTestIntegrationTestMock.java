package com.surasint.example.web.api;

import com.surasint.example.service.CountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestRestControllerTestIntegrationTestMock {


    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test_count() throws Exception {
        //given

        //when
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity("/api/count", String.class);
        String result = responseEntity.getBody();

        responseEntity =
                restTemplate.getForEntity("/api/count", String.class);
        String result2 = responseEntity.getBody();


        //then
        assertEquals("Count result:0",result);
        assertEquals("Count result:1",result2);
    }
}