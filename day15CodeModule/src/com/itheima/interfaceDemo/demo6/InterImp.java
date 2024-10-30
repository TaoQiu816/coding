package com.itheima.interfaceDemo.demo6;

public class InterImp extends InterAdapter{
    //继承中间类
    //只重写接口中要使用的方法即可

    @Override
    public void show3() {
        System.out.println("通过中间类，只使用方法3 ");
    }
}
