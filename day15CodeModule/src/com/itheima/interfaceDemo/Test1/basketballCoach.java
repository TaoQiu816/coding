package com.itheima.interfaceDemo.Test1;

public class basketballCoach extends Coach{
    @Override
    public void Teach() {
        System.out.println("篮球教练教打篮球");
    }

    public basketballCoach() {
    }

    public basketballCoach(String name, int age) {
        super(name, age);
    }


}
