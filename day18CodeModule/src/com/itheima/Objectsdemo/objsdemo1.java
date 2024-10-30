package com.itheima.Objectsdemo;

import com.itheima.objectdemo.Student;

import java.util.Objects;

public class objsdemo1 {
    public static void main(String[] args) {
        //objects是一个对象工具类
       /* public static String toString(Object o) 					// 获取对象的字符串表现形式
        public static boolean equals(Object a, Object b)			// 比较两个对象是否相等，会先做非空判断
        public static boolean isNull(Object obj)					// 判断对象是否为null，为null返回true
        public static boolean nonNull(Object obj)					// 判断对象是否不为null,与isnull结果相反      */

        Student s1 = null;
        Student s2 = new Student("zhangsan",23);

        System.out.println(Objects.equals(s1, s2));
        //细节
        //方法的底层会判断s1是否为null，如果是Null直接返回false
        //如果不是，那么就在利用s1再次调用equals方法，
        //s1是student类型，也就是调用student中的equals

        Student s3 = new Student();
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));
        System.out.println(Objects.isNull(s3));

        System.out.println();

        System.out.println(Objects.nonNull(s1));
        System.out.println(Objects.nonNull(s2));
        System.out.println(Objects.nonNull(s3));

        System.out.println();

        System.out.println(Objects.toString(s1));
        System.out.println(Objects.toString(s2));
        System.out.println(Objects.toString(s3));

    }
}
