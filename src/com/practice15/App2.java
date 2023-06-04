package com.practice15;

public class App2 {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1==str2));
        System.out.println("str3 == str4 : " + (str3==str4));

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        str2 +="oracle";

        System.out.println("str1 == str2 : " + (str1 == str2));

        System.out.println("str1.equals(str3) : " + (str1.equals(str3)));
        System.out.println("str1.equals(str4) : " + (str1.equals(str4)));
    }
}
