package com.practice12;

public class App {
    public static void main(String[] args) {
        InterProduct interProduct = new Product();

        interProduct.nonStaticMethod();
        interProduct.abstMethod();


        interProduct.defaultMethod();
        InterProduct.staticMethod();

        System.out.println(InterProduct.MAX_NUM);
    }
}
