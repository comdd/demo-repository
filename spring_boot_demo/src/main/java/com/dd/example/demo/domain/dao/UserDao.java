package com.dd.example.demo.domain.dao;

import com.dd.example.demo.domain.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @description:
 * @author: dd Date: 2018/2/28 Time: 11:28
 * @version: 1.0.0
 */
public interface UserDao extends JpaRepository<UserInfo, Integer> {
    UserInfo findByUserName(String userName);
    @Query("select u from UserInfo u where u.nickName=:nickName")
    UserInfo findByNickName(@Param("nickName")String nickName);
}
