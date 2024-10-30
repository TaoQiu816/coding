package com.itheima.Test1;

public class MethodTest1 {
    public static void main(String[] args) {
        //调用
        getLength(11.2,22.894);
    }

    //求长方形的周长
    public static void getLength(double len, double width){
        double result = 2*(len+width);
        System.out.println(result);
    }
}
