package com.practice3;

public class LS {
    private static LS lazy;

    private LS()
    {

    }
    public static LS getInstance() {
        if (lazy==null){
            lazy = new LS();
        }

        return lazy;
    }
}
