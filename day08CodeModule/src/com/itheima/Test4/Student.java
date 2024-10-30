package com.itheima.Test4;

public class Student {
    //属性
    private String name;
    private int age;
    //构造方法是一种特殊的方法
    //如果自己没有写任何的构造方法
    //那么虚拟机会自动给出一个空参构造方法，
    //否则系统将不会给出默认的空参构造，若仍需要空参构造，需要自己写
    //使用空参构造，对象的属性均被初始化为默认初始化值
    //使用空参构造若想对成员变量赋值，则要单独使用set方法进行赋值
    //空参构造方法如下（也就是括号内没有参数）

    public Student(){

    }
    //有参构造，在创建对象的同时就对成员变量进行赋值,并且对应的创建对象时括号也不能空着
    //括号内要写上对应成员变量将要赋的值，从而不用再使用set方法进行赋值

    //实际应用时，空参构造和有参构造都要写上
    public Student(String name, int age){
        this.age =age;
        this.name =name;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return  age;
    }

    public void setAge(){
        this.age = age;
    }
}
