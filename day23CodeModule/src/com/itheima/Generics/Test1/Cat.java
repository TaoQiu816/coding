package com.itheima.Generics.Test1;

public abstract class Cat extends Animal {
    //继承抽象类的两个方法：
    ////1.继承抽象类，重写里面所有的抽象方法
    ////2.本身cat也是一个抽象的，让cat的子类再重写重写方法
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Cat{}";
    }

}
