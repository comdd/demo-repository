package com.dd.demo.spi;

import com.dd.demo.spi.java.JavaSPI;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ServiceLoader;

/**
 * Description :
 *
 * @author : dd
 */
@Slf4j
public class JavaSPITest {
    @Test
    public void print() throws Exception {
        ServiceLoader<JavaSPI> spis = ServiceLoader.load(JavaSPI.class);
        log.info("ddddd");
        spis.forEach(JavaSPI::print);
    }

}