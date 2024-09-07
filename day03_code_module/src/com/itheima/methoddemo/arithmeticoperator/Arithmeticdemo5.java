package com.itheima.methoddemo.arithmeticoperator;

public class Arithmeticdemo5 {
    public static void main(String[] args) {
        //+=:先相加，再赋值
        int a = 9;
        int b = 8;
        a += b;
        System.out.println("a:" + a);//17
        System.out.println("b:" + b);//8

        //-=:先减再赋值
        a -= b;
        System.out.println("a:" + a);//9
        System.out.println("b:" + b);//8

        //*=乘后赋值
        a *= b;
        System.out.println("a:" + a);//72
        System.out.println("b:" + b);//8

        ///=除后赋值
        a /= b;
        System.out.println("a:" + a);//9
        System.out.println("b:" + b);//8

        //%=取余后赋值
        a %= b;
        System.out.println("a:" + a);//1
        System.out.println("b:" + b);//8

    }
}
