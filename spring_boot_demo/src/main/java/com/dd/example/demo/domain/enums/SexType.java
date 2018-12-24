package com.dd.example.demo.domain.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @description:
 * @author: dd Date: 2018/3/1 Time: 17:33
 * @version: 1.0.0
 */
public enum SexType{
    OTHER(0,""),MAN(1,"男"),WOMAM(2,"女");
    @Getter
    @Setter
    private int code;
    @Getter
    @Setter
    private String desc;
    SexType(int code, String desc){
        this.code=code;
        this.desc=desc;
    }
}
