package com.dd.demo.pattern.factory.method;

import com.dd.demo.pattern.factory.Honor;
import com.dd.demo.pattern.factory.Phone;

/**
 * Description :
 *
 * @author : dd
 */
public class HonorFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new Honor();
    }
}
