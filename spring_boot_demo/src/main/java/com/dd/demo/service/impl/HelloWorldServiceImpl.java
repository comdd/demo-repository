package com.dd.demo.service.impl;

import com.dd.demo.service.HelloWorldService;
import com.dd.demo.domain.dao.UserDao;
import com.dd.demo.domain.entity.UserInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @description:
 * @author: dd Date: 2018/2/27 Time: 20:09
 * @version: 1.0.0
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Resource
    private UserDao userDao;

    @Override
    public String getHello(String var) {
        return var + ",hello world";
    }

    @Override
    public UserInfo getUser(String userName) {
        return userDao.findByUserName(userName);
    }

    @Override
    public UserInfo queryByNickName(String nickName) throws Exception {
        throw new Exception("异常");
//        return userDao.findByNickName(nickName);
    }

    @Override
    public Page<UserInfo> queryForPage(Pageable pageable) {
        return userDao.findAll(pageable);
    }

    @Override
    @Transactional
    public UserInfo save(UserInfo userInfo) {
        return userDao.save(userInfo);
    }
}
