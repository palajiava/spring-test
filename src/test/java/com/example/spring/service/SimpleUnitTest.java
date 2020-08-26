package com.example.spring.service;


import com.example.spring.RestApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestApplication.class)
public class SimpleUnitTest {

    @Test
    public void firstTest(){
        Integer a = 1;
        Assert.assertNotNull(a);
    }

}
