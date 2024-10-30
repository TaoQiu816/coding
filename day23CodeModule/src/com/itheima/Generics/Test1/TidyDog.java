package com.itheima.Generics.Test1;

public class TidyDog extends Dog {
    @Override
    public void eat() {
        //一只叫做xXX的，X岁的哈士奇，正在吃骨头，边吃边拆家
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的哈士奇，正在吃骨头，边吃边拆家");
    }
}
