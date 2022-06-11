package com.f434.tests;


import com.f434.Person;
import com.f434.Test01;
import com.f434.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IocTest {

    ApplicationContext ioc;
//    test标记的方法每次都会执行before里面的方法
    @Before
    public void befor(){
        /**
         * 加载spring容器
         *
         * ApplicationContext是Spring IoC容器实现的代表，
         * 它负责实例化，配置和组装Bean是spring的顶层核心接口
         *
         * ClassPathXmlApplicationContext 根据项目路径的xml配置来实例化spring容器
         * FileSystemXmlApplicationContext 根据磁盘路径的xml配置来实例化spring容器(了解)
         * AnnotationConfigApplicationContext 根据Javaconfig文件来配置实例化spring容器(纯注解)
         * 在容器实例化的时候,就会加载所有的bean (实例化对象)
         *
         * */

        ioc = new ClassPathXmlApplicationContext("spring_ioc.xml");

    }

    @Test
    public void test01(){



/**
 *         1.通过类来获取bean -->ioc.getBean(User.class);
 *         2.通过bean的id或者名字来获取bean (需要强制转换)-->User bean2 = (User) ioc.getBean("user");
 * /        3.通过名字加上类型 -->User bean2 = ioc.getBean("user",User.class); (适用场景,相同的类下不同的id)*/
//        User bean = ioc.getBean(User.class);
        User bean2 = ioc.getBean("user2",User.class);
//        System.out.println(bean);
        System.out.println(bean2);

    }


    @Test
    public void test02(){
        System.out.println("spring容器已加载");
//        通过别名来获取bean (只是别名)
        User bean = ioc.getBean("name05", com.f434.User.class);

        System.out.println(bean);
    }


    /**
     * 基于Setter依赖注入
     */
    @Test
    public void test03(){
        System.out.println("spring容器已加载");

        User bean = ioc.getBean("user3", com.f434.User.class);

        System.out.println(bean);
    }


    /**
     * 基于构造函数的依赖注入
     */
    @Test
    public void test04(){
        System.out.println("spring容器已加载");

        User bean = ioc.getBean("user4", com.f434.User.class);

        System.out.println(bean);
    }

    /**
     * 复杂类型依赖注入
     */
    @Test
    public void test05(){
        System.out.println("spring容器已加载");

        Person bean = ioc.getBean("person", Person.class);

        System.out.println(bean);
    }
    /**
     * 使用P命名空间来简化基于setter属性注入xml配置
     */
    @Test
    public void test06(){
        System.out.println("spring容器已加载");

        Person bean = ioc.getBean("person2", Person.class);

        System.out.println(bean);
    }


    /**
     * 泛型是基本数据类型用<value></value>
     * 泛型是bean(即对象)就要使用  <bean></bean>
     *
     */
    @Test
    public void test07(){
        System.out.println("spring容器已加载");

        Test01 test01 = ioc.getBean("test01",Test01.class);

        System.out.println(test01);
    }
}
