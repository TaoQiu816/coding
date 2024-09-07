package com.itheima.Test;

public class MethodTest4 {
    public static void main(String[] args) {
        //方法的重载

        compare((byte) -126,(byte)126);
        compare((short) -32768,(short) 32767);
        compare(-2^31,2^31-1);
        compare((long) -2^63,(long) 2^63-1);
        compare((long) 2^63-1,(long) 2^63-1);

        //整数默认int类型，其他几种类型要强行转换
    }
    //将相同功能的方法名字取一样构成重载
    //好处1：定义时不用使用太多的词汇
    //好处2：调用时更简单
    //重载方法，比较两个整数是否相同，* 兼容全整数类型（byte,short,int,long）
    //
    //*
    public static void compare(byte b1, byte b2){
        System.out.println("byte");
        System.out.println(b1 == b2);
    }
    public static void compare(short s1, short s2){
        System.out.println("short");
        System.out.println(s1 == s2);
    }
    public static void compare(int i1, int i2){
        System.out.println("int");
        System.out.println(i1 == i2);
    }
    public static void compare(long l1, long l2){
        System.out.println("long");
        System.out.println(l1 == l2);
    }


}
