package com.itheima.Generics;

public class GenericsDemo3 {
    public static void main(String[] args) {
        //泛型接口的两种使用方式:
        //1.实现类给出具体的类型
        //2.实现类延续泛型，创建实现类对象时再确定类型
        //


        ////1.实现类给出具体的类型
        Myarraylist2 myarraylist2 = new Myarraylist2();
        myarraylist2.add("aaa");

        //2.实现类延续泛型，创建实现类对象时再确定类型
        myarraylist3<Integer> myarraylist3 = new myarraylist3<>();
        myarraylist3.add(123);
    }
}
