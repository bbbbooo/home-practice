package com.practice11;

public class App {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        Product product = new SmartPhone();

        product.abstMethod();
        product.nonStaticMethod();
        product.staticMethod();
    }
}
