package com.itheima.stringBuilder;

public class stringBuilderDemo2 {
    public static void main(String[] args) {
        //链式编程：
        //当我们在调用一个方法时，不需要用变量接收他的结果，可以继续调用其他方法
        StringBuilder sb = new StringBuilder();
        sb.append(10).append(2.25).append("abcd");
        System.out.println(sb);
    }
}
