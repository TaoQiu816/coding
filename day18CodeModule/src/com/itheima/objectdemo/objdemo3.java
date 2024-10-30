package com.itheima.objectdemo;

public class objdemo3 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s.equals(sb));
        //equals方法被s调用，故equals方法是string类中的方法
        //字符串中的equals方法，先判断参数是否为字符串
        //如果是字符串，再比较内部的属性
        //如果参数不是字符串，直接返回false


        System.out.println(sb.equals(s));
        //此处是调用StringBuilder中的equals方法
        //但是StringBuilder没有重写此方法，因而使用的是Object中的equals方法
        //比较两个对象的地址值是否相等
    }
}
