package com.dd.demo.pattern.factory.method;


/**
 * Description :
 *
 * @author : dd
 */
public class Test {

    public static void main(String[] args){
        Factory factory1 = new AppleFactory();
        Factory factory2 = new HonorFactory();
        factory1.createPhone().create();
        factory2.createPhone().create();

    }
}
