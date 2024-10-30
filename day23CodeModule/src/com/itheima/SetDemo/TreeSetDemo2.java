package com.itheima.SetDemo;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        //需求:创建Treeset集合，并添加3个学生对象
        //学生对象属性:
        //姓名，年龄。
        //要求按照学生的年龄进行排序
        //同年龄按照姓名字母排列(暂不考虑中文)
        //同姓名，同年龄认为是同一个人

        //排序方式一：
        //      默认的排序规则/自然排序
        //      Student类(JAVABEAN类)实现Comparable接口，重写里面的抽象方法，再指定比较规则

        //排序方式二：
        //      比较器排序
        //      创建TreeSet对象的时候，传递比较器conparator指定规则

        //两者都存在时，以方式二为准

        //排序默认使用第一种方式，当不能满足需求时使用第二种方式

        Student s1 = new Student("zhangsan",25);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",23);
        Student s4 = new Student("zhangsan",25);

        TreeSet<Student> ts = new TreeSet<>();
        System.out.println(ts.add(s1));
        System.out.println(ts.add(s2));
        System.out.println(ts.add(s3));
        System.out.println(ts.add(s4));

        System.out.println(ts);
    }
}
