package com.itheima.IntegerDemo;

public class IntegerDemo2 {
    public static void main(String[] args) {
        //以前包装类的计算：
        //不能直接计算
        //要对包装类进行拆箱，变成基本数据类型在计算
        //计算后在装箱为包装类对象

        //在JDK5之后提出的新机制：自动装箱和自动拆箱
        //自动装箱：把基本数据类型会自动变成其对应的包装类
        //自动拆箱：把包装类自动的变成其对应的基本数据类型

        //再底层，此时还会去自动调用静态方法valueOf得到一个integer对象，只不过不需要我们手动操作
        Integer i1 = 10;//自动装箱

        Integer i2 = new Integer(10);
        int i = i2;//自动拆箱

        //因此在jdk5之后，可以将int和Integer看作同一个东西，因为在内部可以自动转换
    }
}
