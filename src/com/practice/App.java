package com.practice;


public class App {
    public static void main(String[] args) {
        MemberDTO mem = new MemberDTO();
        
        mem.setNumber(1);
        mem.setName("홍길동");
        mem.setAge(20);
        mem.setGender('남');
        mem.setHeight(180.5);
        mem.setWeight(70.8);
        mem.setActivated(true);

        System.out.println("mem.getNumber() = " + mem.getNumber());
        System.out.println("mem.getName() = " + mem.getName());
        System.out.println("mem.getAge() = " + mem.getAge());
        System.out.println("mem.getGender() = " + mem.getGender());
        System.out.println("mem.getHeight() = " + mem.getHeight());
        System.out.println("mem.getWeight() = " + mem.getWeight());
        System.out.println("mem.isActivated() = " + mem.isActivated());
    }
}
