package com.practice3;

public class ES {
    private static ES eager = new ES();

    private ES(){
    }

    public static ES getInstance() {
        return eager;
    }
}
