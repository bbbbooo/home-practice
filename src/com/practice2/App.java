package com.practice2;

public class App {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getInfo());

        User user2 = new User("user01", "pass01", "홍길동");
        System.out.println(user2.getInfo());

        User user3 = new User("user02", "pass02", "이순신", new java.util.Date());
        System.out.println(user3.getInfo());

        User user4 = new User(user3);
        System.out.println(user4.getInfo());
    }
}
