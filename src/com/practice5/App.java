package com.practice5;

public class App {
    public static void main(String[] args) {
        Product product = new Product();

        System.out.println(product.getInfo());

        Product product1 = new Product("대륙폰", 30000, "샤우미");
        System.out.println(product1.getInfo());

    }
}
