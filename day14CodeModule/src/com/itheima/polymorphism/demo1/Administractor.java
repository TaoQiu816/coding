package com.itheima.polymorphism.demo1;

public class Administractor extends Person{

    @Override
    public void show() {
        System.out.println("管理员的信息为：" + getName()+","+getAge());
    }

    public Administractor() {
    }

    public Administractor(String name, int age) {
        super(name, age);
    }
}
