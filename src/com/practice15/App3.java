package com.practice15;

public class App3 {
    public static void main(String[] args) {
        String emp1 = "100/홍길동/서울/영업부";		//모든 값 존재함
        String emp2 = "200/유관순//총무부";			//주소 없음
        String emp3 = "300/이순신/경기도/";

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        for (int i =0; i<empArr1.length;i++){
            System.out.println("empArr1[" + i + "] = " + empArr1[i]);
        }

        for (int i =0; i<empArr2.length;i++){
            System.out.println("empArr2[" + i + "] = " + empArr2[i]);
        }

        for (int i =0; i<empArr3.length;i++){
            System.out.println("empArr3[" + i + "] = " + empArr3[i]);
        }
    }
}
