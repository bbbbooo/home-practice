package com.practice12;

public class Product extends Object implements InterProduct, java.io.Serializable {
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출...");

    }

    @Override
    public void abstMethod() {
        System.out.println("InterProduct의 staticMethod 오버라이딩한 메소드 호출...");
    }

    @Override
    public void defaultMethod(){
        System.out.println("Product 클래스의 defaultmethod 호출...");
    }


}
