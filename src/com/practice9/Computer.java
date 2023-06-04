package com.practice9;

import java.util.Date;

public class Computer extends Product{
    private String cpu;
    private int hdd;
    private int ram;
    private String os;


    public Computer(){
        System.out.println("Computer 클래스의 기본 생성자 호출됨...");
    }

    public Computer(String cpu, int hdd, int ram, String os){
        super();

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;

        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출함....");
    }

    public Computer(String code, String brand, String name, int price, Date date,
                    String cpu, int hdd, int ram, String os){
        super(code, brand, name, price, date);

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;

        System.out.println("Computer 클래스의 부모 필드도 초기화하는 생성자 호출함...");;
    }


    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getHdd() {
        return hdd;
    }

    public int getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getOs() {
        return os;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", os='" + os + '\'' +
                '}';
    }
}
