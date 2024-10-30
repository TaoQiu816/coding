package com.itheima.interfaceDemo.Test1;

public class basketballPlayer extends Player{
    @Override
    public void Learn() {
        System.out.println("篮球运动员学打篮球");
    }

    public basketballPlayer() {
    }

    public basketballPlayer(String name, int age) {
        super(name, age);
    }
}
