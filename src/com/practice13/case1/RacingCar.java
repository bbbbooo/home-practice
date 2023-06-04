package com.practice13.case1;

public class RacingCar extends Car{

    @Override
    public void go(){
        System.out.println("레이싱카가 달려나갑니다.");
    }

    @Override
    public void stop(){
        System.out.println("레이싱카가 멈춥니다.");
    }
}
