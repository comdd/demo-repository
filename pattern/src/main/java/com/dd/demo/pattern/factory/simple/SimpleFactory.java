package com.dd.demo.pattern.factory.simple;

import com.dd.demo.pattern.factory.Apple;
import com.dd.demo.pattern.factory.Honor;
import com.dd.demo.pattern.factory.Phone;
import org.springframework.util.StringUtils;


/**
 * Description :简单工厂模式 不满足开闭原则
 *
 * @author : dd
 */
public class SimpleFactory {
    private SimpleFactory() {
    }

    public static Phone createPhone(String name){
        if(StringUtils.isEmpty(name)){
            throw new RuntimeException("没有产品类型");
        }
        if(name.equals("apple")){
            return new Apple();
        }
        if(name.equals("honor")){
            return new Honor();
        }
        throw new RuntimeException("没有产品类型");
    }
    public static void main(String[] args){
        createPhone("apple").create();
        createPhone("honor").create();
        createPhone("galaxy").create();
    }
}
