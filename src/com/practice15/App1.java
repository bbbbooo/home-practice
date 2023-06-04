package com.practice15;

public class App1 {
    public static void main(String[] args) {
        String str1 = "apple";

        for(int i=0;i<str1.length();i++){
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo : " + (str2.compareTo(str3)));
        System.out.println("compareTo : " + (str2.compareTo(str4)));
        System.out.println("compareTo : " + (str4.compareTo(str2)));
        System.out.println("compareTo : " + (str2.compareTo(str5)));
        System.out.println("compareTo : " + (str5.compareTo(str2)));

        System.out.println("대소문자 구분안함 : " + (str3.compareToIgnoreCase(str4)));

        System.out.println("concat : " + (str2.concat(str5)));
        System.out.println("str2 : " + str2);

        String trimStr ="   java    ";
        System.out.println("trimStr : #" + trimStr + "#");
        System.out.println("공백 : #" + trimStr.trim() + "#");

    }
}
