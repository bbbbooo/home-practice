package com.todo;

public class CarRacer {
    private final Car car = new Car();

    public void startUp(){
        car.startUp();
    }

    public void stepAccel(){
        car.go();
    }

    public void stepBreak(){
        car.stop();
    }

    public void turnOff(){
        car.turnoff();
    }
}
