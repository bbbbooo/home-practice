package com.todo;

public class Car {

    private boolean isOn;
    private int speed;

    public void startUp(){
        if(isOn){
            System.out.println("시동이 꺼져있습니다.");
        }
        else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 출발 준비가 완료되었습니다.");
        }
    }

    public void go(){
        if(isOn){
            System.out.println("차가 앞으로 움직입니다...");
            this.speed += 10;
            System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다.");
        }
        else {
            System.out.println("시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    public void stop(){
        if(isOn && this.speed >= 10){
            this.speed = 0;
            System.out.println("차를 멈춥니다...");
        }
        else{
            System.out.println("시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    public void turnoff(){
        if (isOn){
            if(speed >0){
                System.out.println("달리는 상태에서는 차를 시동을 끌 수 없습니다. 차를 우선 멈춰주세요.");
            }
            else {
                this.isOn = false;
                System.out.println("시동을 멈췄습니다.");
            }
        }
        else{
            System.out.println("이미 꺼진 상태에서는 시동을 끌 수 없습니다.");
        }
    }


}
