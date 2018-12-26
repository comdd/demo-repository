package com.dd.demo.pattern.factory.abstracted;

/**
 * Description :
 *
 * @author : dd
 */
public class FactoryA implements AbstractFactoy {
    @Override
    public Apple createApple() {
        return new Apple8Plus();
    }

    @Override
    public Honor createHonor() {
        return new Honor5C();
    }
}
