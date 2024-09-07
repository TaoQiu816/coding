package com.itheima.methoddemo.logicoperator;

public class logicoperator_demo1 {
    public static void main(String[] args) {
        //&  与   都真则真
        System.out.println(true & true);

        //|  或   有真则真
        System.out.println(false | false);

        //^  异或
        System.out.println(true ^ true);


        //!  非
        //取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println(!false);

    }
}
