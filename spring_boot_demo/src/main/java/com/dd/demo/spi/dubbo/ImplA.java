package com.dd.demo.spi.dubbo;

import lombok.extern.slf4j.Slf4j;

/**
 * Description :
 *
 * @author : dd
 */
@Slf4j
public class ImplA implements DubboSPI {
    @Override
    public void print() {
        log.info("java spi A impl");
    }
}
