package com.f434.tests;

import com.f434.Girl;
import com.f434.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocHTest {
    ClassPathXmlApplicationContext ioc;

    @Before
    public void before(){
        ioc = new ClassPathXmlApplicationContext("spring-ioc-hight.xml");
    }

    @Test
    public void test01(){

        System.out.println("spring已加载");

    }


    /**
     * 懒加载
     *
     * */

    @Test
    public void test02(){
       Girl bean = ioc.getBean("girl", Girl.class);
        System.out.println("spring已加载");


    }

    /**
     * 作用域
     *
     * */

    @Test
    public void test03(){
        Person bean = ioc.getBean("person", Person.class); //new Person();
        Person bean2 = ioc.getBean("person", Person.class); //new Person();
        System.out.println(bean);
//        System.out.println(bean2);


    }

    /**
     * 使用静态工厂方法来实例化bean
     *
     * */

    @Test
    public void test04(){
        Person bean = ioc.getBean("person", Person.class); //new Person();
        System.out.println(bean);



    }


    /**
     * 使用实例工厂方法来实例化bean
     *
     * */

    @Test
    public void test05(){
        Person bean = ioc.getBean("person", Person.class); //new Person();
        System.out.println(bean);



    }

    /**
     * 自动注入
     *
     * */

    @Test
    public void test06(){
        Person bean = ioc.getBean("person", Person.class); //new Person();
        System.out.println(bean);



    }

    /**
     * 生命周期回调
     * 1.使用接口方式回调
     *      1.初始化回调 实现InitializingBean 重写  afterPropertiesSet()
     *      2.销毁回调 实现DisposableBean 重写  destroy()
     *
     *
     * */

    @Test
    public void test07(){
        Person bean = ioc.getBean("person", Person.class); //new Person();

        System.out.println(bean);
//        ClassPathXmlApplicationContext 下的close方法
        ioc.close();




    }
}
