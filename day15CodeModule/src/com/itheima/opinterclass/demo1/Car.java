package com.itheima.opinterclass.demo1;

import java.util.SortedMap;

public class Car {
    private String Carname;
    private int CarAge;
    private String CarColor;


    //外部类访问内部类要创建内部类的对象
    //括号内相当于car this
    public void show() {
        System.out.println(Carname);
        //上面这句相当于用this访问
        System.out.println();
        Engine e = new Engine();
        System.out.println(e.engName);
    }


    //内部类表示的事物是外部类的一部分，且内部类单独存在没有意义
    //内部类,一个class文件只能有一个public类？
    class Engine {
        private String engName;
        private int engAge;

        public void show() {

            //内部类可以直接访问外部类成员,有private也可以
            System.out.println(Carname);
            System.out.println(engName);
        }
    }

    //若私有化内部类，可在外部类编写方法，对外提供内部类
    public Engine getInstance(){
        return new Engine();
    }


}
