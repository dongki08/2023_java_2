package com.green.day3.ch4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x = %d 일 때, 참인 것은\n", x);
        if( x == 0 ) { System.out.println("x == 0"); } //소괄호 안에 true, false
        if( x != 0 ) { System.out.println("x != 0"); } // false일시 실행안됨

        System.out.println("-------");

        x = 1;
        System.out.printf("x = %d 일 때, 참인 것은\n", x);
        if( x == 0 ) { System.out.println("x == 0"); }
        if( x != 0 ) { System.out.println("x != 0"); }

        System.out.println("끝!");
    }
}
