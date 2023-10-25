package com.green.day16.ch7;

public class Singleton {
    private Singleton() {}
    private static Singleton singleton;
    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance(); //스태틱 앞에 대문자로 시작
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
