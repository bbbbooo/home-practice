package com.practice7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MemberService memberManager = new MemberService();


        while (true){
            System.out.println("======== 회원 관리 프로그램 ========");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : memberManager.signUpMembers(); break;
                case 2 : memberManager.showAllMembers(); break;
                case 9 :
                    System.out.println("프로그램을 종료합니다."); break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }

            if(no==9){
                break;
            }
        }

    }
}
