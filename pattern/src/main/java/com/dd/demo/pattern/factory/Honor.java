package com.dd.demo.pattern.factory;

/**
 * Description :
 *
 * @author : dd
 */
public class Honor implements Phone {
    @Override
    public void create() {
        System.out.println("生产荣耀一部");
    }
}
