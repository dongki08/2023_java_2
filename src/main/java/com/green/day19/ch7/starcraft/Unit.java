package com.green.day19.ch7.starcraft;

import java.util.ArrayList;
import java.util.List;

class StarcraftGame {
    public static void main(String[] args) {
        Unit unit = new Marine();
        unit.move(10, 20);

        Unit unit2 = new Tank();
        unit2.move(10, 20);

        List<Unit> units = new ArrayList();
        units.add(unit);
        units.add(unit2);
        units.add(new Marine());
    }
}

class StarcraftGame2 {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList();
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Tank());
        units.add(new Tank());

        moveAll(units, 30, 50);

        Unit unit1 = units.get(units.size() - 1);
        Tank tank = (Tank)unit1;
        tank.changeMode2();
        tank.changeMode2();
    }
    public static void moveAll(List<Unit> units, int x, int y) {
        for(int i = 0; i < units.size(); i++) {
            Unit unit = units.get(i);
            unit.move(x, y);
        }
    }
}

public abstract class Unit {
    protected int x;
    protected int y;

    public abstract void move(int x, int y);
    public void stop() {
        System.out.println("현재 위치에 정지");
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}

class Marine extends Unit {
    @Override
    public void move(int x, int y) {
        setX(x);
        setY(y);
        System.out.printf("마린이 좌표 %d, %d로 이동\n", x, y);
    }
    public void steampack() {
        System.out.println("스팀팩 시전!!!");
    }
}

class Tank extends Unit {
    private boolean siegeMode;
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("탱크가 좌표 %d, %d로 이동\n", x ,y);
    }
    //siegeMode = false는 시즈모드가 아니다
    //이 상태에서 changeMode메소드가 호출이 되면 > 시즈모드가 되어야하니깐,
    //siegeMode = true; 들어가야되고 콘솔에는 " 시즈모드가 되었습니다. "

    //siegeMode = true; 는 시즈모드가 된거다.
    //이 상태에서 changeMode메소드가 호출이 되면 > 시즈모드가 풀려야한다.
    //siegeMode = false 가 들어가야되고 콘솔에는 " 시즈모드가 풀렸습니다 "

    public void changeMode2() {
        siegeMode = !siegeMode;
        System.out.println(siegeMode ? "시즈모드가 되었습니다." : "시즈모드가 풀렸습니다.");
    }
    public void changeMode() {
        if(siegeMode) {
            siegeMode = false;
            System.out.println("시즈모드가 풀렸습니다.");
        }else {
            siegeMode = true;
            System.out.println("시즈모드가 되었습니다");
        }
    }
}
