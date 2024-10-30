package com.itheima.polymorphism.test;

public class TEST1 {
    public static void main(String[] args) {
        Student s = new Student("张三",24);
        method1(s);
        System.out.println(s.getAge());

        method2(s);
        System.out.println(s.getAge());
    }

    public static void method1(Student s){
        //修改
        s.setAge(25);
    }
    public static void method2(Student s){
        //不修改
        //s.setAge(s.getAge());
    }
}
