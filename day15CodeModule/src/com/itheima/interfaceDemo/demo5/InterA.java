package com.itheima.interfaceDemo.demo5;

public interface InterA {

    public default void show1(){
        System.out.println("show1方法执行了");
        show3();
    }

    public default void show2(){
        System.out.println("show2方法执行了");
        show3();
    }
    //对于默认方法和静态方法中的重复代码，可以使用私有方法

    //服务于默认方法的私有方法（普通的私有方法），不用加defult关键字
    private void show3(){
        System.out.println("服务于默认方法的普通私有方法");
    }

    //服务于静态方法的私有方法（静态私有方法），不能省略static关键字
    private static void show4(){
        System.out.println("服务于静态方法的静态私有方法");
    }
    public static void show5(){
        System.out.println("静态方法");
        show4();
    }
}
