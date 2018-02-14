package com.surasint.example.web.api;

import com.surasint.example.service.CountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebMvcTest(TestRestController.class)
public class TestRestControllerTest2 {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CountService mockCountService;

    @Test
    public void test_count() throws Exception {
        //given
        when(mockCountService.count()).thenReturn(100);

        //when
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/api/count")).andReturn();
        String result = mvcResult.getResponse().getContentAsString();

        //then
        assertEquals("Count result:100",result);
    }
}