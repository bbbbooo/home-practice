package com.practice5;

public class Product {

    // 명시적 초기화
    private String name = "갤럭시";
    private int price = 10000;
    private static String brand = "샘숭";


    // 인스턴스 초기화
    {
        name = "아이뻐";
        price = 90000;
        brand = "사과";

        System.out.println("인스턴스 초기화 블럭 시작...");
    }


    // 정적 초기화
    static {
        brand = "헬쥐";
        System.out.println("정적 초기화 블럭 시작...");
    }

    public Product(){
        System.out.println("기본 생성자 호출...");
    }

    public Product(String name, int price, String brand){
        this.name = name;
        this.price = price;
        Product.brand = brand;

        System.out.println("매개변수 생성자 생성...");
    }

    public String getInfo(){
        return "Product [name] = " + this.name + ", price = " + this.price + ", brand = " + Product.brand + "]";
    }


}
