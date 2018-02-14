package com.surasint.example.web.api;

import com.surasint.example.service.CountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestRestControllerTest1 {

    @Mock
    private CountService mockCountService;

    @InjectMocks
    private TestRestController target;

    @Test
    public void test_count(){
        //given
        when(mockCountService.count()).thenReturn(100);

        //when
        String result = target.count();

        //then
        assertEquals("Count result:100", result);
    }
}
