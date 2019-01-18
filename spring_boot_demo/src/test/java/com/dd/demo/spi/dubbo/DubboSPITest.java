package com.dd.demo.spi.dubbo;

import org.junit.Test;

import java.util.ServiceLoader;

import static org.junit.Assert.*;

/**
 * Description :
 *
 * @author : dd
 */
public class DubboSPITest {
    @Test
    public void print() throws Exception {
        ExtensionLoader<DubboSPI> extensionLoader =
                ExtensionLoader.getExtensionLoader(DubboSPI.class);
        DubboSPI a = extensionLoader.getExtension("A");
        a.sayHello();
        DubboSPI b = extensionLoader.getExtension("B");
        b.sayHello();
    }

}