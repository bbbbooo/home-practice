package com.practice7;

public class MemberRepository {
    private final static Member[] members;
    private static int cnt;

    static {
        members = new Member[10];
    }

    public static boolean store(Member[] newMembers) {
        for(int i=0;i<newMembers.length;i++){
            members[cnt++] = newMembers[i];
        }

        return true;
    }


    public static Member[] findAllMembers() {
        return members;
    }
}
