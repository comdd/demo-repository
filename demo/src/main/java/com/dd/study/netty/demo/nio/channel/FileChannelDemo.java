package com.dd.study.netty.demo.nio.channel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Description:
 *
 * @author dongld.li Date:20-4-19 Time:下午5:36
 */
public class FileChannelDemo {

    public static void main(String[] args) throws Exception {
        read();
    }
    private static void copy0() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("/tmp/test.txt");
        FileChannel sourceChannel = fileInputStream.getChannel();
        FileOutputStream fileOutputStream = new FileOutputStream("2.txt");
        FileChannel targetChannel = fileOutputStream.getChannel();
        sourceChannel.transferTo(0,sourceChannel.size(),targetChannel);
        sourceChannel.close();
        targetChannel.close();
        fileInputStream.close();
        fileOutputStream.close();

    }
    private static void copy() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("/tmp/test.txt");
        FileChannel readChannel = fileInputStream.getChannel();
        FileOutputStream fileOutputStream = new FileOutputStream("2.txt");
        FileChannel writeChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        while (true) {
            byteBuffer.clear();
            int read = readChannel.read(byteBuffer);
            if (read == -1) {
                break;
            }
            byteBuffer.flip();
            writeChannel.write(byteBuffer);
        }
        fileInputStream.close();
        fileOutputStream.close();

    }

    private static void read() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/tmp/test.txt");
        FileChannel fileChannel = fileInputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate((int) fileChannel.size());
        fileChannel.read(byteBuffer);
        System.out.println(new String(byteBuffer.array()));
    }

    private static void write() throws IOException {
        String str = "hello world";
        FileOutputStream fileOutputStream = new FileOutputStream("/tmp/test.txt");
        FileChannel fileChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put(str.getBytes());
        byteBuffer.flip();
        //将buffer中数据写入到channel
        fileChannel.write(byteBuffer);
        fileChannel.close();
    }
}
