package com.dd.example.demo;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

/**
 * @description:
 * @author: dd Date: 2018/2/27 Time: 17:39
 * @version: 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseTest {
    protected MockMvc mockMvc;
    @Resource
    private WebApplicationContext wac;

    @Before
    public void setUp() {
            this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }
}
