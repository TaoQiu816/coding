package com.itheima.methoddemo.arithmeticoperator;

public class Arithmeticdemo1 {
    public static void main(String[] args) {
        //加+
        System.out.println(3 + 2);//5
        //减-
        System.out.println(5 - 1);//4
        //乘*
        System.out.println(8 * 9);//72

        //如果计算的时候有小数参与
        //结论
        //在代码中，如果有小数参与，结果有可能不精确
        //暂时只记住这个结论，后面深入讲解(与数字在计算机中的存储有关)
        System.out.println(1.1 + 1.01);//2.1100000000000003
        System.out.println(1.1 + 1.1);//2.2
        System.out.println(1.1 - 1.01);//0.09000000000000008
        System.out.println(1.1 * 1.01);//1.1110000000000002


    }
}
