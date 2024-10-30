package com.itheima.opinterclass.demo3;

import javax.sound.midi.Soundbank;

public class Outer {
    int a = 10;
    static int b = 20;

    //静态内部类
    static class Inner{
        //静态内部类可以直接访问外部类中的静态成员（与之前的规则相同
        public void show1(){
            System.out.println(b);
//只要是静态的东西，都可以用类名加点直接访问
            //若要访问外部类的非静态，则要先创建外部类的对象
           Outer o = new Outer();
            System.out.println(o.a);
            System.out.println("非静态方法");
        }
        public static void show2(){
            System.out.println("静态方法");
        }
    }
}
