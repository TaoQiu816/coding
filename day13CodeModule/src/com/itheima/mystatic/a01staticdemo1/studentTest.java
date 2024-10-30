package com.itheima.mystatic.a01staticdemo1;

public class studentTest {
    public static void main(String[] args) {
        //static静态成员变量直接使用类名调用
        //静态变量被该类所有对象共享

        //调用方式1：类名调用（推荐）
        //2：对象名调用
        //静态变量随着类的加载而加载，优先于对象出现，存放在堆中的静态区（属于类，而不属于对象）
        //静态变量由对象共享，并且在静态区只有一份，那个对象要用就直接叫用，而动态变量则是每个对象独有的
        Student.teacherName = "邱老师";
        //创建第一个学生对象
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        //s1.teacherName="邱老师";

        s1.study();
        s1.show();

        //创建第二个对象
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(22);
        s2.setGender("女");

        s2.study();
        s2.show();
    }
}
