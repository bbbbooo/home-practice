package com.practice9;

import java.util.Date;

public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;
    private Date date;

    public Product(){
        System.out.println("Product 클래스의 기본 생성자 호출됨...");
    }

    public Product(String code, String brand, String name, int price, Date date){
        super();

        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.date = date;

        System.out.println("Product 클래스의 매개변수 있는 생성자 호출함...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getCode(){
        return code;
    }
    public String getBrand(){
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public String getInfo() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
