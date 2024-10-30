package com.itheima.SetDemo;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        //利用HashSet集合去除重复元素
        //需求:
        //创建一个存储学生对象的集合，存储多个学生对象。
        //
        //使用程序实现在控制台遍历该集合。
        //要求:学生对象的成员变量值相同，我们就认为是同一个对象，则添加失败

        //在存放string Integer等类型不用重写，因为java已经重写好了hashcode和equals方法
        //创建学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //创建集合添加学生
        HashSet<Student> hs = new HashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));//false  对象重复，添加失败(已重写hashcode方法)



        System.out.println(hs);
    }
}
