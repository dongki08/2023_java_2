package com.green.day3.ch4;

/*
    Scanner
    if
    parsing

 */

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 하나 입력하세요 > ");
        String str = scan.nextLine();
        int val = Integer.parseInt(str);

        if( val == 0 ) {
            System.out.println("입력하신 숫자는 0입니다.");
        }

        if( val != 0 ) {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }
        //(콘솔) 숫자를 하나 입력하세요>
        //(입력 기다려야함)
        //숫자가 입력하고 엔터를 누르면
        //String 변수에 해당값이 저장될 수 있도록
        //해당 문자열을 > 정수형으로 형변환
        //해당 숫자가 0이라면 콘솔에 "입력하신 숫자는 0입니다."
        //해당 숫자가 0이 아니라면 콘솔에 "입력하신 숫자는 0이 아닙니다."
    }
}
