package com.itheima.interfaceDemo.demo4;

public class InterImp implements InterA,InterB{

    @Override
    public void show() {
        InterA.super.show();
    }

    @Override
    public void method() {
        System.out.println("实现类重写的method");
    }


}
