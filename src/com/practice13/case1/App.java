package com.practice13.case1;


public class App {
    public static void main(String[] args) {
        Car fireCar = new FireCar();
        Car rcCar =  new RacingCar();

        fireCar.go();
        fireCar.stop();
        ((FireCar) fireCar).horn();

        rcCar.go();
        rcCar.stop();
    }
}
