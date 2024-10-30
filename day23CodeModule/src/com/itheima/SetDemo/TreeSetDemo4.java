package com.itheima.SetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        //需求:创建5个学生对象
        //属性:(姓名,年龄，语文成绩,数学成绩,英语成绩)
        //按照总分从高到低输出到控制台
        //如果总分一样，按照语文成绩排
        //如果语文一样，按照数学成绩排
        //如果数学成绩一样，按照英语成绩排
        //如果英文成绩一样，按照年龄排
        //如果年龄一样，按照姓名的字母顺序排
        //如果都一样，认为是同一个学生，不存。

        //五个学生对象studentset
        StudentSet s1 = new StudentSet("zhangsan",23,80,99,75);
        StudentSet s2 = new StudentSet("lisi",21,82,90,91);
        StudentSet s3 = new StudentSet("wangwu",22,89,86,88);
        StudentSet s4 = new StudentSet("zhaoliu",25,75,80,66);
        StudentSet s5 = new StudentSet("anny",24,90,87,80);

        //创建集合
        TreeSet<StudentSet> ts = new TreeSet<>();

        //添加对象
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (StudentSet t : ts) {
            System.out.println(t);
        }
    }
}
