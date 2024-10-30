package com.itheima.Lambda;

public class lambdaDemo2 {
    public static void main(String[] args) {
        //lambda表达式
        //基本作用：简化函数式接口的匿名内部类的写法
        //前提：必须是接口的匿名内部类，接口中只能有一个抽象方法（函数式接口）
        //可通过@functionalinterface注解验证函数式接口

        //1。利用匿名内部类的形式调用方法
        //调用一个方法的时候，如果方法的形参是一个接口，呢么我们要传递这个接口的实现类对象
        //如果实现类对象只要用到一次，就可以使用匿名内部类的形式去写

        /*method(new swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳");
            }
        });*/

        //2.LAMBDA表达式
        method(
                () -> {
                    System.out.println("正在游泳");
                }
        );

    }

    public static void method(swim s) {
        s.swimming();
    }
}

@FunctionalInterface
interface swim {
    public abstract void swimming();
}