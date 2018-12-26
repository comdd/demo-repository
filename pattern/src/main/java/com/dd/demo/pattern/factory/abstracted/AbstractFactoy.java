package com.dd.demo.pattern.factory.abstracted;

/**
 * Description : 抽象工厂模式，一个具体工厂对应多个产品，但是添加新产品时改动的类较多，产品类，工厂类都需要改
 *
 * @author : dd
 */
public interface AbstractFactoy {
    Apple createApple();
    Honor createHonor();
}
