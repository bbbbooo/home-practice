package com.practice14;


public class App1 {
    public static void main(String[] args) {
        Book book1 = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(2, "목민심서","정약용",30000);
        Book book3 = new Book(2, "목민심서","정약용",30000);

        System.out.println("book1.toString() = " + book1.toString());
        System.out.println("book2.toString() = " + book2.toString());
        System.out.println("book3.toString() = " + book3.toString());
    }
}
