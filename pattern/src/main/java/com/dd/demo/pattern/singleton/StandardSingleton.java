package com.dd.demo.pattern.singleton;

/**
 * Description: 标准单例模式
 *
 * @author : dd
 */
public class StandardSingleton {
    private StandardSingleton() {
    }

    public static StandardSingleton getInstance() {
        return SingletonInstance.instance;
    }

    private static class SingletonInstance {

        static StandardSingleton instance = new StandardSingleton();

    }
}

