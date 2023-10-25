package com.green.day19.ch7;

public class AnonymousClassTest {
    public static void main(String[] args) {
        Runnable2 run = new RunRobotImpl();
        Runnable2 run2 = new Runnable2() {
            @Override
            public void run() {
                System.out.println("하하하");
            }
        };
    }
}

interface Runnable2 {
    void run();
}

class RunRobotImpl implements Runnable2 {
    @Override
    public void run() {
        System.out.println("로봇이 달린다.");
    }
}