package com.green.day3.ch4;

public class MultiIf {
    public static void main(String[] args) {
        int num = 79;

        if(num >= 50) {
            if (num >= 80) {
                System.out.printf("%d는 엄청 엄청 엄청 크다!", num);
            } else {
                System.out.printf("%d는 엄청 엄청 크다!", num);
            }
        }else {
            if (num >= 40) {
                System.out.printf("%d는 엄청 크다!", num);
            } else {
                System.out.printf("%d는 좀 크다!", num);
            }
        }
    }
}
