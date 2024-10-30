package com.itheima.opinterclass.demo5;

public class Test2 {
    public static void main(String[] args) {


        //匿名内部类可以卸载成员位置也可以写在局部位置

        //整体可以理解为Swim接口的实现类对象
        //因此可以实现接口多态
        //接口多态
        Swim s = new Swim(){

            @Override
            public void swim() {
                System.out.println("重写SWIM方法");
            }
        };

        //也可以调用方法

        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写SWIM方法");
            }
        }.swim();
        //可以调用大括号内的类的自己的所有方法

    }


}
