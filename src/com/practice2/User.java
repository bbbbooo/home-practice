package com.practice2;

public class User {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;


    public User() {
        System.out.println("기본 생성자 호출...");
    }

    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;

        System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함...");
    }

    public User(String id, String pwd, String name, java.util.Date enrollDate) {
        this(id, pwd, name);
        this.enrollDate = enrollDate;

        System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출함...");
    }

    public User(User otheruser) {
        this(otheruser.id, otheruser.name, otheruser.pwd, otheruser.enrollDate);

        System.out.println("User 클래스의 복사 생성자 호출함...");

        System.out.println("원본 유저의 해시코드 : " + this.hashCode());
        System.out.println("복사된 유저의 해시코드 : " + otheruser.hashCode());
    }

    public String getInfo() {
        return "User [id =" + this.id + ", pwd =" + this.pwd + ", name =" + this.name + ", enrollDate =" + this.enrollDate + "]";
    }
}
