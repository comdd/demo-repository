package com.dd.example.demo.service;

import com.dd.example.demo.domain.entity.UserInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @description:
 * @author: dd Date: 2018/2/27 Time: 20:15
 * @version: 1.0.0
 */
public interface HelloWorldService {
    String getHello(String var);
    UserInfo getUser(String userName);
    UserInfo queryByNickName(String nickName) throws Exception;
    Page<UserInfo> queryForPage(Pageable pageable);
    UserInfo save(UserInfo userInfo);
}
