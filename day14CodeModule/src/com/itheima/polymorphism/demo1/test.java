package com.itheima.polymorphism.demo1;

public class test {
    public static void main(String[] args) {
        Student s = new Student("张三",18);
        Teacher t = new Teacher("王建国",40);
        Administractor a = new Administractor("管理员",35);


        register(s);
        register(t);
        register(a);

        //多态特点
        //调用成员变量：编译看左边，运行也看左边（先看父类有没有，如果有才执行，并且使用父类中的成员变量）
        //调用成员方法：编译看左边，运行看右边（先看父类有没有，如果有才执行，并且使用子类中的成员方法）
    }

    //此方法既能接受老师，又能接受学生和管理员
    //只能把参数写成这三个类的父类
    //使用父类作为形参，可以接受所有的子类对象
    public static void register(Person p){
        p.show();
    }
}
