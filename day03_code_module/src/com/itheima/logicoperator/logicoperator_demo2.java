package com.itheima.logicoperator;

public class logicoperator_demo2 {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);


        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(true || true);

        //短路效果
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b <5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);//短路效果，对b的效果不执行
    }
}
