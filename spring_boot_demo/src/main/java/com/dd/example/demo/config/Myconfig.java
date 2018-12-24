package com.dd.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: dd Date: 2018/3/7 Time: 15:41
 * @version: 1.0.0
 */
@Component
@PropertySource(value = "classpath:config/myconfig.properties")
@ConfigurationProperties(prefix = "man")
@Data
public class Myconfig {

    private String name;
    private int age;
}
