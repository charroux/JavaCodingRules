package com.charroux.javaCodingRules.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MyDataTest {

    MyData myData;

    @BeforeEach
    public void init(){
        myData = new MyData(0);
    }

    @Test
    public void test(){
        assertEquals(0, myData.getI());
    }
}
