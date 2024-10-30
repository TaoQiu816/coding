package com.itheima.Test4;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //调用的空参构造
        Student s = new Student();
        System.out.println(s.getAge());
        System.out.println(s.getName());


        Student ss = new Student("zhangsan", 18);
        System.out.println(ss.getAge());
        System.out.println(ss.getName());
    }

}
