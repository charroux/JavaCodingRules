package com.charroux.javaCodingRules.web;

import com.charroux.javaCodingRules.data.MyData;
import com.charroux.javaCodingRules.service.DataException;
import com.charroux.javaCodingRules.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsIterableContaining.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(WebService.class)
public class WebServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MyService myService;

    @Test
    public void average() throws Exception{
        when(myService.average()).thenReturn(1);
        mockMvc.perform(get("/average"))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("1")));
    }

    @Test
    public void data() throws Exception {
        List<MyData> myDataList = new ArrayList<MyData>();
        myDataList.add(new MyData(1));
        when(myService.getData()).thenReturn(myDataList);
        mockMvc.perform(get("/")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].i", equalTo(1)));
    }
}

