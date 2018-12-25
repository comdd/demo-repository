package com.dd.demo.controller;

import com.dd.demo.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @description:
 * @author: dd Date: 2018/2/27 Time: 17:37
 * @version: 1.0.0
 */
@Slf4j
public class HelloWorldControllerTest extends BaseTest {

    @Test
    public void getHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("hello qunarman")));
    }

    @Test
    public void helloTest() throws Exception {
        MvcResult mvcResult = this.mockMvc.perform(
                MockMvcRequestBuilders.get("/hello")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
        ).andReturn();
        log.info("结果：{}", mvcResult.getResponse().getContentAsString());
    }

    @Test
    public void userTest() throws Exception {
        MvcResult mvcResult = this.mockMvc.perform(
                MockMvcRequestBuilders.get("/user")
                        .param("userName", "qunardd")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
        ).andReturn();
        log.info("结果：{}", mvcResult.getResponse().getContentAsString());
    }

    @Test
    public void configTest() throws Exception {
        MvcResult mvcResult = this.mockMvc.perform(
                MockMvcRequestBuilders.get("/myconfig")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
        ).andReturn();
        log.info("结果：{}", mvcResult.getResponse().getContentAsString());
    }
}