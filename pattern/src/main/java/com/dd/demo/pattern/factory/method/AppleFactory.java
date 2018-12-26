package com.dd.demo.pattern.factory.method;

import com.dd.demo.pattern.factory.Apple;
import com.dd.demo.pattern.factory.Phone;

/**
 * Description :
 *
 * @author : dd
 */
public class AppleFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new Apple();
    }
}
