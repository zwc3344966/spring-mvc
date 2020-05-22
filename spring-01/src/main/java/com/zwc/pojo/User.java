package com.zwc.pojo;


/**
 * @author: zhangwch
 * @create: 2020-05-22 14:13
 * lombok : 自己练习的时候使用，开发不要使用
 * @Data：编译后生成get()、set()方法
 * @AllArgsConstructor：编译后生成有参构造方法
 * @NoArgsConstructor：编译后生成无参构造方法
 * @ToString：编译后生成toString()方法
 **/
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class User {
    private String id;
    private String name;
    private String age;

    public User(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
