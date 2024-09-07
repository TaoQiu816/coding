package com.itheima.methoddemo.arithmeticoperator;

public class Arithmeticdemo2 {
    public static void main(String[] args) {
        //除法/
        //结论：
        //1. 整数参与计算，结果只能是整数
        //2. 小数参与计算，结果有可能是不精确的，如果我们需要精确计算，那么需要用到后面的知识
        System.out.println(10 / 2);//5
        System.out.println(10 / 3);//3
        System.out.println(10.0 / 3);//3.3333333333333335

        //取模，取余：实际上也是除法运算，只不过得到的是余数而已
        System.out.println(10 % 2);
        System.out.println(10 % 3);
        //应用场景：
        //1.可以用取模来判断，A是否可以被B整除
        //如A % B  10 % 3
        //2.判断偶数
        //A % 2 如果结果为0，那么证明A是偶数，如果结果为1，那么就是奇数
    }
}
