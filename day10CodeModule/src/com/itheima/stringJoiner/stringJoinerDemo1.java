package com.itheima.stringJoiner;

import java.util.StringJoiner;

public class stringJoinerDemo1 {
    public static void main(String[] args) {
        //stringjoiner也是一个容器，创建后内容可变，可提高字符串操作效率
        //没有空参构造
        //1.创建时指定间隔符号
        StringJoiner sj = new StringJoiner("---");

        //添加元素，调用add方法，注意不是append，返回sj本身
        //只能添加字符串
        sj.add("1").add("2").add("3");
        //返回长度，即所有字符的总个数
        int len = sj.length();
        System.out.println(len);
        String str = sj.toString();
        System.out.println(str);
        System.out.println(sj);

        StringJoiner sj1 = new StringJoiner(",","[","]");
        sj1.add("1").add("2").add("3");
        //返回长度
        int len1 = sj1.length();
        System.out.println(len1);
        String str1 = sj.toString();
        System.out.println(str1);
        System.out.println(sj1);



    }
}
