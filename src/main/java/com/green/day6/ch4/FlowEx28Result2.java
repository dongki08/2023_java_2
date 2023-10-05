package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28Result2 {
    public static void main(String[] args) {
        //int input = 0;
        int answer = (int) (Math.random() * 100) + 1; //1~100
        System.out.println("answer : " + answer);
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("1~100 사이의 정수를 입력하세요 >> ");
            final int input = scan.nextInt();
            if (input == answer) { break;}
            System.out.println(input < answer ? "Up" : "Down");
        }
        System.out.println("끝!!");
    }
}

        /*
        1~100 사이의 정수를 입력하세요 >>
        입력한 숫자보다 정답이 크다 > up
        입력한 숫자보다 정답이 작다 > Down
        맞출때마다 반복한다.
         */

