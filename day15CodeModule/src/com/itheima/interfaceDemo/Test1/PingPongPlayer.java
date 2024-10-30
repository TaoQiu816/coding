package com.itheima.interfaceDemo.Test1;

public class PingPongPlayer extends Player implements speakEng{
    @Override
    public void Learn() {
        System.out.println("学打乒乓球");
    }

    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEng() {
        System.out.println("乒乓运动员说英语");
    }
}
