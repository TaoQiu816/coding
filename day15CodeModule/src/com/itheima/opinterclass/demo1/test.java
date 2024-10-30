package com.itheima.opinterclass.demo1;

public class test {
    public static void main(String[] args) {
        Car c = new Car();

        //Car.Engine e = new Car.Engine();

        //创建成员内部类的的对象,地位与成员变量相同
        Car.Engine ce = new Car().new Engine();

    }
}
