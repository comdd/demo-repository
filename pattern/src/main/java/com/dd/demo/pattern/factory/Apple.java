package com.dd.demo.pattern.factory;

/**
 * Description :
 *
 * @author : dd
 */
public class Apple implements Phone {
    @Override
    public void create() {
        System.out.println("生产苹果一部");
    }
}
