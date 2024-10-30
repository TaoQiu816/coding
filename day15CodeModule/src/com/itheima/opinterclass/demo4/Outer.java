package com.itheima.opinterclass.demo4;

public class Outer {

    //局部内部类，在方法里面
    public void show() {
        int a = 10;

        //局部内部类，类似于方法中的局部变量
        //外界无法直接使用局部内部类，需要在方法内创建该内部内的对象
        //局部内部类可以直接访问外部类的成员，也可以访问方法内的局部变量
        class Inner {
            String name;
            int age = 20;

            public void method1() {
                System.out.println(a);
                System.out.println(age);
                System.out.println("局部内部类非静态方法");
            }

            public void method2() {
                System.out.println("局部内部类静态方法");
            }
        }

        Inner i = new Inner();
        i.method1();
        i.method2();
    }
}
