package com.itheima.opinterclass.demo2;

public class test {
    public static void main(String[] args) {

        //创建内部类对象
        Outer o = new Outer();
        Outer.inner oi = new Outer().new inner();
        oi.show();
    }
}
