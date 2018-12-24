package com.dd.example.demo.domain.entity;

import com.dd.example.demo.domain.enums.SexType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @description: 可以自动创建表，不需要人工在mysql中执行sql去建表
 * @author: dd Date: 2018/2/28 Time: 11:27
 * @version: 1.0.0
 */
@Data
@Accessors(chain = true)
@Entity
public class UserInfo {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String nickName;
    @Column(nullable = false)
    private SexType sex;
    @Column(nullable = false)
    @JsonFormat(pattern = "yyyyMMdd HH:mm:ss")
    private Date date;
}
