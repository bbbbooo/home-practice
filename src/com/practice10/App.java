package com.practice10;

public class App {
    public static void main(String[] args) {
        System.out.println("Animal 생성------------------");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("Rabbit 생성----------------------");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println("Tiger 생성------------------------");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        Animal a1 = new Rabbit();
        Animal a2 = new Tiger();

        System.out.println("동적 바인딩 확인---------------");
        a1.cry();
        a2.cry();

        System.out.println("클래스타입 형변환 확인 -------------");
        ((Rabbit) a1).jump();
        ((Tiger) a2).bite();

        System.out.println("instanceof 확인 --------------");
        System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger));
        System.out.println("a1이 Rabbit 타입인지 확인 : " + (a1 instanceof Rabbit));
        System.out.println("a1이 Animal 타입인지 확인 : " + (a1 instanceof Animal));
        System.out.println("a1이 Object 타입인지 확인 : " + (a1 instanceof Object));

        if(a1 instanceof Rabbit){
            ((Rabbit) a1).jump();
        }
        else{
            ((Tiger) a2).bite();
        }

    }
}
