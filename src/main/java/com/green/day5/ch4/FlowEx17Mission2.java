package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Mission2 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하세요. ");
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();

        for(int i = val; i > 0; i--) {
            for(int z = 1; z <= val; z++) {
                if(z < i) {
                    System.out.print("_");
                }else

                    System.out.print("*");
            }

            System.out.println();
        }
    }
}
// ____* a(1) < i(5) = ( _ ), a(2) < i(5) = ( _ ), a(3) < i(5) = ( _ ), a(4) < i(5) = ( _ ), a(5) < i(5) = ( * )
// ___** a(1) < i(4) = ( _ ), a(2) < i(4) = ( _ ), a(3) < i(4) = ( _ ), a(4) < i(4) = ( * ), a(5) < i(4) = ( * )
// __*** a(1) < i(3) = ( _ ), a(2) < i(3) = ( _ ), a(3) < i(3) = ( * ), a(4) < i(3) = ( * ), a(5) < i(3) = ( * )
// _**** a(1) < i(2) = ( _ ), a(2) < i(2) = ( * ), a(3) < i(2) = ( * ), a(4) < i(2) = ( * ), a(5) < i(2) = ( * )
// ***** a(1) < i(1) = ( * ), a(2) < i(1) = ( * ), a(3) < i(1) = ( * ), a(4) < i(1) = ( * ), a(5) < i(1) = ( * )


