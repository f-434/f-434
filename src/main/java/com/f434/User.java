package com.f434;

public class User {
    private Integer id;
    private String userName;
    private String realName;

//  无参构造
    public User() {}

//    构造方法
    public User(Integer id, String userName, String realName) {
        this.id = id;
        this.userName = userName;
        this.realName = realName;
    }


//    getter&setter
    public Integer getId() {return id;}

//    基于Setter依赖注入 ,对应其set方法的名字
//    setId -> name="id"   setXXX -> name="XXX"
    public void setId(Integer id) {this.id = id;}

    public String getUserName() {return userName;}

    public void setUserName(String userName) {this.userName = userName;}

    public String getRealName() {return realName;}

    public void setRealName(String realName) {this.realName = realName;}

//    重写tostring
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
