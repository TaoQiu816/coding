package com.itheima.opinterclass.demo3;

public class test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();

        //调用非静态方法
        oi.show1();

        //调用静态
        Outer.Inner.show2();
    }
}
