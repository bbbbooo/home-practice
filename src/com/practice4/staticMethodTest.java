package com.practice4;

public class staticMethodTest {
    private int cnt;

    public void nonStaticCnt(){
        this.cnt++;

        System.out.println("nonStaticCnt 호출됨...");
    }

    public static void StaticCnt(){
        //this.cnt++;

        System.out.println("staticCnt 호출됨..");
    }

}
