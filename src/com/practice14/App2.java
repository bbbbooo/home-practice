package com.practice14;

public class App2 {
    public static void main(String[] args) {
        Book book1 = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(1,"홍길동전","허균",50000);

        System.out.println("연산비교 : " + (book1==book2));
        System.out.println("equals() 비교 : " + (book1.equals(book2)));

    }



}
