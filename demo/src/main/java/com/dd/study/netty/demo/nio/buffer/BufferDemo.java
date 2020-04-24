package com.dd.study.netty.demo.nio.buffer;

import java.nio.IntBuffer;
import java.util.Arrays;

/**
 * Description:
 *
 * @author dongld.li Date:20-4-19 Time:下午4:45
 */
public class BufferDemo {

    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(5);
        for (int i = 0; i < intBuffer.capacity(); i++) {
            intBuffer.put(i * 3);
        }
        //读写切换
        intBuffer.flip();
        System.out.println(Arrays.toString(intBuffer.array()));
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }
    }
}
