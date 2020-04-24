package com.dd.study.netty.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description:
 *
 * @author dongld.li Date:20-4-19 Time:下午8:57
 */
public class Main {
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args){
        executorService.execute(()->{
            System.out.println("dd");
        });
    }
}
