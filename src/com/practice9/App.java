package com.practice9;


import java.util.Date;

public class App {
    public static void main(String[] args) {

        Product product1 = new Product();
        System.out.println(product1.getInfo());

        Product product2 = new Product("S-01234", "샘숭", "갤s",2370340,new Date());
        System.out.println(product2.getInfo());

        Computer computer1 = new Computer();
        System.out.println(computer1.getInfo());

        Computer computer2 = new Computer("퀄컴 스냅드래곤",512,12,"안드로이드");
        System.out.println(computer2.getInfo());

        Computer computer3 =
                new Computer("S-01234", "삼성", "갤럭시Z폴드2", 2398000, new java.util.Date()
                        , "퀼컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer3.getInfo());
    }
}
