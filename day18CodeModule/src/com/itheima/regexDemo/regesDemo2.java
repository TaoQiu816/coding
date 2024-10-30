package com.itheima.regexDemo;

public class regesDemo2 {
    public static void main(String[] args) {
        //正则表达式:(只能匹配一个字符)从左到右一个一个字符进行匹配，一个字符对应一个方括号
        //字符类
        //1. [abc]：代表a或者b，或者c字符中的一个。
        //2. [^abc]：代表除a,b,c以外的任何字符。
        //3. [a-zA-Z]：a到z或A到Z,包括范围边界
        //4. [a-d[m-p]: a到d或m到p
        //5. [a-z&&[def]：范围交集，a-z和def的交集，即d,e,f
        //6. [a-z&&[^bc]： 范围交集，a-z和非bc的交集，等同于[ad-z]
        //7. [a-z&&[^m-p]：范围交集，a-z和除了m到p的交集，等同于[a-lq-z]

        //只能是abc中的一个，或的关系
        System.out.println("------------------1------------------");
        System.out.println("a".matches("[abc]"));//t
        System.out.println("f".matches("[abc]"));//f
        System.out.println("ab".matches("[abc]"));//f
        System.out.println("ab".matches("[abc][abc]"));//t

        //不能是abc
        System.out.println("------------------2------------------");
        System.out.println("a".matches("[^abc]"));//f
        System.out.println("f".matches("[^abc]"));//t
        System.out.println("def".matches("[^abc]"));//f
        System.out.println("def".matches("[^abc][^abc][^abc]"));//t

        //a-z A-Z范围，包含范围边界
        System.out.println("------------------3------------------");
        System.out.println("a".matches("[a-zA-Z]"));//t
        System.out.println("a".matches("[a-z[A-Z]]"));//同上，内部加括号为了提高可读性
        System.out.println("0".matches("[a-zA-Z]"));//f
        System.out.println("xyzXYZ".matches("[a-zA-Z]"));//f

        //交集,要用&&，只写一个&表示字符
        System.out.println("------------------4------------------");
        System.out.println("a".matches("[a-c&&[a-z]]"));//t
        System.out.println("f".matches("[a-c&&[g-i]]"));//f
        System.out.println("a".matches("[a-z&&[^def]]"));//t
        System.out.println("a".matches("[a-z&&[^m-p]]"));//t
        System.out.println("a".matches("[a-l[q-z]]"));//t  与上行同理

    }
}
