package com.practice16;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();

        // 데이터 저장시 offer 사용
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);


        // peek = 해당 큐의 맨 앞에 있는 요소를 반환
        // poll = 해당 큐의 맨 앞에 있는 요소를 반환하고 제거함
        System.out.println("que.peek() = " + que.peek());
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que.poll() = " + que.poll());
    }
}
