package com.itheima.methoddemo;

public class MethodDemo3 {
    public static void main(String[] args) {
        //直接调用
        getSum(11.1, 22.2, 33.3);
        //赋值调用
        double sum = getSum(11.1, 22.2, 33.3);
        System.out.println(sum);
        //输出调用
        System.out.println(getSum(11.1, 22.2, 33.3));
    }

    //求和
    public static double getSum(double num1, double num2, double num3) {
        double result = num1 + num2 + num3;
        return result;//将结果返回至方法的调用处
    }
}
