package com.dd.demo.pattern.singleton;

import java.util.Objects;

/**
 * description: 简单单例模式
 * 1、线程不安全
 * 2、第一次使用时创建实例
 *
 * @author dd
 */
public class SimpleSingleton {
    private static SimpleSingleton singleton;

    private SimpleSingleton() {
    }

    ;

    public static SimpleSingleton getInstance() {
        if (Objects.isNull(singleton)) {
            singleton = new SimpleSingleton();
        }
        return singleton;
    }
}
