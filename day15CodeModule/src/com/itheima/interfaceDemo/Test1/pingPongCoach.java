package com.itheima.interfaceDemo.Test1;

public class pingPongCoach extends Coach implements speakEng{
    @Override
    public void Teach() {
        System.out.println("乒乓教练教打乒乓球");
    }

    public pingPongCoach() {
    }

    public pingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEng() {
        System.out.println("乒乓球教练说英语");
    }
}
