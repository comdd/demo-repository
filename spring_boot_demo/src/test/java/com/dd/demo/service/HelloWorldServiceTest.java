package com.dd.demo.service;

import com.dd.demo.domain.enums.SexType;
import com.dd.demo.BaseTest;
import com.dd.demo.domain.entity.UserInfo;
import com.qunar.hotel.ims.common.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @description:
 * @author: dd Date: 2018/3/1 Time: 17:18
 * @version: 1.0.0
 */
@Slf4j
public class HelloWorldServiceTest extends BaseTest{

    @Resource
    private HelloWorldService helloWorldService;

    @Test
    public void queryByNickName(){

        try {
            log.info("查询结果：{}",helloWorldService.queryByNickName("dd"));
        } catch (Exception e) {
           log.error("异常信息：{}",e.getMessage());
        }
    }
    @Test
    public void queryForPage() throws IOException {
        Pageable pageable = new PageRequest(0,2);
        log.info("查询结果：{}", JsonUtil.encode(helloWorldService.queryForPage(pageable).getContent()));
    }
    @Test
    public void save(){
        log.info("保存：{}",helloWorldService.save(new UserInfo().setUserName("test")
        .setNickName("test")
        .setPassword("dada")
        .setSex(SexType.MAN)));
    }
}
