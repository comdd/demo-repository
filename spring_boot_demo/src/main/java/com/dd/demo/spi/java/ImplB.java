package com.dd.demo.spi.java;

import lombok.extern.slf4j.Slf4j;

/**
 * Description :
 *
 * @author : dd
 */
@Slf4j
public class ImplB implements JavaSPI {
    @Override
    public void print() {
        log.info("java spi B impl");
    }
}
