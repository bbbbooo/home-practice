package com.practice4;

public class App {
    public static void main(String[] args) {
        staticTest sft1 = new staticTest();
        staticTest sft2 = new staticTest();

        System.out.println("sft1.getNonStaticCount() = " + sft1.getNonStaticCount());
        System.out.println("sft1.getStaticCount() = " + sft1.getStaticCount());

        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        System.out.println("sft1.getNonStaticCount() = " + sft1.getNonStaticCount());
        System.out.println("sft1.getStaticCount() = " + sft1.getStaticCount());

        System.out.println("sft2.getNonStaticCount() = " + sft2.getNonStaticCount());
        System.out.println("sft2.getStaticCount() = " + sft2.getStaticCount());

        staticMethodTest smt = new staticMethodTest();
        smt.nonStaticCnt();
//        smt.StaticCnt();

        staticMethodTest.StaticCnt();
        
    }
}
