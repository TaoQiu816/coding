package com.itheima.arithmeticoperator;

public class Arithmeticdemo4 {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;//先用再加
        int z = ++x;//先加再用
        System.out.println("x:" + x);//注意x已经执行过两次自加
        System.out.println("y:" + y);
        System.out.println("z:" + z);

    }
}
