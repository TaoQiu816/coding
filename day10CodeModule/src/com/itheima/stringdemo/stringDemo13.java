package com.itheima.stringdemo;

public class stringDemo13 {
    public static void main(String[] args) {
        String s = "";
        for (int i=0;i<=1000000;i++){
            s = s+ "abc";
        }
        System.out.println(s);
    }
}
