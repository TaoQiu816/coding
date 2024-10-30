package com.itheima.interfaceDemo.demo4;

public interface InterA {

    //默认方法不是抽象方法，不会被强制重写，但是如果要重写，重写时要去掉defult关键字
    //默认方法的public可以省略，但defult不能省略，若省略会被当成抽象方法

    //如果实现了多个接口，多个接口存在相同名字的默认方法，子类必须对该方法进行重写
    //若不重写，则在测试类中调用重名方法会造成混乱
    public default void show() {
        System.out.println("接口InterA中的默认方法=========show");
    }


    public abstract void method();

    //接口中的静态方法，不需要重写也不能重写
    //通过接口名调用，不能通过实现类或对象名调用，public可省略，static不能省略
    public static void method1() {
        System.out.println("接口中的静态方法");
    }
}
