package com.itheima.mystatic.a03staticdemo3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //存放三个学生对象，调用工具方法，求最大学生年龄
        ArrayList<Student> list = new ArrayList<>();

        //添加学生
        list.add(new Student("zhangsan", 21, "男"));
        list.add(new Student("lisi", 27, "男"));
        list.add(new Student("wangwu", 18, "男"));

        int maxAge = StudentUtill.getMaxAge(list);
        System.out.println(maxAge);
    }
}
