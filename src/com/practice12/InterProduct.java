package com.practice12;

public interface InterProduct extends java.io.Serializable{
    int MAX_NUM = 100;

    public abstract void nonStaticMethod();

    void abstMethod();

    public static void staticMethod(){
        System.out.println("InterProduct 클래스의 staticMethod 호출....");
    }

    public default void defaultMethod(){
        System.out.println("InterProduct 클래스의 defaultMethod 호출...");
    }


}
