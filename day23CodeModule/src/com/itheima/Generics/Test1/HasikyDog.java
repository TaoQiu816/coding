package com.itheima.Generics.Test1;

public class HasikyDog extends Dog {
    @Override
    public void eat() {
        //一只叫做xXX的，X岁的泰迪，正在吃骨头，边吃边蹭
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的泰迪，正在吃骨头，边吃边蹭");
    }
}
