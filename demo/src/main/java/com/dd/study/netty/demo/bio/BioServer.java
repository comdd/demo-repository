package com.dd.study.netty.demo.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author dongld.li Date:20-4-19 Time:下午4:07
 */
@Service
public class BioServer {
    private static ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String args[]) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("BIO服务端启动");
        while (true) {
            //创建监听
            final Socket socket = serverSocket.accept();
            System.out.println("收到一个连接");
            executorService.execute(() -> handler(socket));
        }
    }

    public static void handler(Socket socket) {
        byte[] bytes = new byte[1024];
        try {
            InputStream inputStream = socket.getInputStream();
            while (true) {
                int read = inputStream.read(bytes);
                if (read != -1) {
                    String result = new String(bytes, 0, read);
                    System.out.println("客户端输入的数据：" + result);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("关闭socket");
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
