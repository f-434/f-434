package com.f434;

import java.util.Date;

public class PersonFactory {
//    使用实例工厂方法来实例化bean
    public Person craetPersonFactory(){
        Child child = new Child();
        child.setName("儿子");
        return child;
    }

    public static Date getNow(){
        return new Date();
    }
}
