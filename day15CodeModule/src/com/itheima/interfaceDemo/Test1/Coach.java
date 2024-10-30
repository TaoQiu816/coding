package com.itheima.interfaceDemo.Test1;

public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void Teach();
}
