package com.itheima.polymorphism.opfinal;

public class test1 {
    public static void main(String[] args) {

        //基本数据类型
        final double PI = 3.1415926;

        //引用数据类型
        final Student s = new Student("张三", 23);
        System.out.println(s.getName() + "," + s.getAge());
        s.setAge(24);
        System.out.println(s.getName() + "," + s.getAge());

        final int[] ARR = {1,2,3,4,5};
        ARR[0]=10;
        System.out.println(ARR[0]);

    }
}
