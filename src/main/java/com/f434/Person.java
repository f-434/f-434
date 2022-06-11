package com.f434;

import javafx.fxml.Initializable;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Person implements InitializingBean , DisposableBean {
    private Integer id;
    private String name;
    private String gender;
    private Date birthday;
    private List<String> hobbies;
    private Map<Integer ,String> course;//课程
    private Girl girl;

    public Person() {
        System.out.println("Persion已加载");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<Integer, String> getCourse() {
        return course;
    }

    public void setCourse(Map<Integer, String> course) {
        this.course = course;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", hobbies=" + hobbies +
                ", course=" + course +
                ", girl=" + girl +
                '}';
    }


    public Person(Girl girl3) {
        this.girl = girl3;
    }



//    使用静态工厂方法来实例化bean
    public static Person createPersonFactory(){
        Child child = new Child();
        child.setName("儿子");
        return child;

    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("实例化Person");
    }

    public void destroy() throws Exception {
        System.out.println("Person对象销毁");

    }


//    ____________________________________________________
    public void personFactoryByinit(){
        System.out.println("实例化Person");
    }

    public  void personFactoryByddestory(){
        System.out.println("Person对象销毁");
    }
}
