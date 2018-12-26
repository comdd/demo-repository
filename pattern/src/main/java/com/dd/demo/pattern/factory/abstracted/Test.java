package com.dd.demo.pattern.factory.abstracted;


/**
 * Description :
 *
 * @author : dd
 */
public class Test {

    public static void main(String[] args) {
        AbstractFactoy factoryA = new FactoryA();
        AbstractFactoy factoryB = new FactoryB();
        factoryA.createApple().create();
        factoryA.createHonor().create();
        factoryB.createApple().create();
        factoryB.createHonor().create();

    }
}
