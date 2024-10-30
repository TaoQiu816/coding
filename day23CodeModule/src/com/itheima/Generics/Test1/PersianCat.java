package com.itheima.Generics.Test1;

public class PersianCat extends Cat {
    @Override
    public void eat() {
        //一只叫做xXX的，X岁的波斯猫，正在吃小饼干
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的波斯猫，正在吃小饼干");
    }

    public PersianCat() {
    }

    public PersianCat(String name, int age) {
        super(name, age);
    }
}
