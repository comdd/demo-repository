package com.dd.demo.pattern.singleton;

import java.util.Objects;

/**
 * Description : 支持并发的单例
 *
 * @author :  dd
 */
public class ConcurrentSingleton {
    private static ConcurrentSingleton concurrentSingleton;

    private ConcurrentSingleton() {
    }

    public static ConcurrentSingleton getInstance() {
        if (Objects.isNull(concurrentSingleton)) {
            synchronized (ConcurrentSingleton.class) {
                if (Objects.isNull(concurrentSingleton)) {
                    concurrentSingleton = new ConcurrentSingleton();
                }
            }
        }
        return concurrentSingleton;
    }
}
