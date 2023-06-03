package com.practice4;

public class staticTest {
    private int nonStaticCount;
    private static int staticCount;

    public staticTest(){}

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public int getStaticCount() {
        return staticTest.staticCount;
    }

    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }

    public void increaseStaticCount() {
        staticTest.staticCount++;
    }
}
