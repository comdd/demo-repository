package com.dd.demo.pattern.factory.abstracted;

/**
 * Description :
 *
 * @author : dd
 */
public class FactoryB implements AbstractFactoy {
    @Override
    public Apple createApple() {
        return new AppleX();
    }

    @Override
    public Honor createHonor() {
        return new Honor6();
    }
}
