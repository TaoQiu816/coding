package com.itheima.Generics.Test1;

public class LihuaCat extends Cat {
    @Override
    public void eat() {
        //一只叫做xxX的，X岁的狸花猫，正在吃鱼
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的狸花猫，正在吃鱼");
    }

    public LihuaCat() {
    }

    public LihuaCat(String name, int age) {
        super(name, age);
    }
}
