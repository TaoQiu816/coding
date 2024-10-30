package com.itheima.interfaceDemo.demo2;

public class InterImp implements Inter1,Inter2 {
    @Override
    public void method1() {
        //method1在两个接口中重名，
        //在此只重写一次，但是相当于对两个接口的该抽象方法都进行了重写
    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }
}
