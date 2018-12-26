package com.dd.demo.pattern.factory.method;

import com.dd.demo.pattern.factory.Phone;

/**
 * Description : 工厂方法模式,一个具体对应一个具体产品
 *
 * @author : dd
 */
public interface Factory {
    Phone createPhone();
}
