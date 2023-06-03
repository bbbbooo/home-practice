package com.practice3;

public class App {
    public static void main(String[] args) {
        ES eager1 = ES.getInstance();
        ES eager2 = ES.getInstance();

        System.out.println("eager1.hashCode() = " + eager1.hashCode());
        System.out.println("eager2.hashCode() = " + eager2.hashCode());

        LS lazy1 = LS.getInstance();
        LS lazy2 = LS.getInstance();

        System.out.println("lazy1.hashCode() = " + lazy1.hashCode());
        System.out.println("lazy2.hashCode() = " + lazy2.hashCode());
    }
}
