package com.itheima.regexDemo;

public class regexDemo3 {
    public static void main(String[] args) {
        //预定义字符（只能匹配一个字符）
        //  反斜线\表示转义字符 改变后面那个字符原本的含义
        //在java中，双反斜线\\表示的是\（前面一个反斜线将后一个反斜线原有的意思（转义字符）改变，变为一个普通的反斜线）


        //  .    任何字符
        //  \d   一个数字：[0-9]
        //  \D   非数字：[^0-9]
        //  \s   一个空白字符：[\t\n\x0B\f\r]
        //  \S   非空白字符：[^\s]
        //  \w   英文、数字、下划线：[a-zA-Z_0-9]
        //  \W   一个非单词字符：[^\w]

       /* System.out.println("2".matches("."));//t
        System.out.println("2".matches(".."));//f
        System.out.println("2a".matches(".."));//t

        System.out.println("2".matches("\\d"));//t
        System.out.println("a".matches("\\d"));//f
        System.out.println("23".matches("\\d\\d"));//t


        System.out.println("2".matches("\\w"));//t
        System.out.println("a".matches("\\w"));//t
        System.out.println("A".matches("\\w"));//t
        System.out.println("_".matches("\\w"));//t
        System.out.println("你".matches("\\w"));//f*/


      //  System.out.println("你".matches("\\W"));//t

//注意 要求整个字符串与正则表达式完全匹配。
//Possessive(贪婪) 数量词（所有的，所有格的）
//直接匹配整个字符串，如果完全匹配就匹配成功，否则匹配失败。效果相当于equals()
        //带数量词判断
        //  X?    X,一次或0次
        //  X*    X,多次或0次
        //  X+    X,一次或多次
        //  X{n}    X,正好n次
        //  X{n,}    X,至少n次
        //  X{n,m}    X,至少n次但不超过m次，也就是n~m次
        System.out.println();
        System.out.println("0".matches("\\d?"));//t  一次
        System.out.println("a1".matches("\\d?"));//f   0次
        System.out.println("012".matches("\\d?"));//f  三次
        System.out.println("1acv".matches("\\d?"));//f 一次


        System.out.println();
        System.out.println("0".matches("\\d*"));//f  一次
        System.out.println("a".matches("\\d*"));//t   0次
        System.out.println("012".matches("\\d*"));//t  三次
        System.out.println("1acv".matches("\\d*"));//f 一次

        System.out.println();
        System.out.println("0".matches("\\d+"));//t  一次
        System.out.println("a".matches("\\d+"));//f   0次
        System.out.println("012".matches("\\d+"));//t  三次
        System.out.println("1acv".matches("\\d+"));//t 一次

        System.out.println();
        System.out.println("0".matches("\\d{3}"));//f  一次
        System.out.println("a".matches("\\d{3}"));//f   0次
        System.out.println("012".matches("\\d{3}"));//t  三次
        System.out.println("1acv".matches("\\d{3}"));//f 一次

        System.out.println();
        System.out.println("ab".matches("\\w{3,}"));//f  2次
        System.out.println("abcdf".matches("\\w{3,}"));//t   5次
        System.out.println("012".matches("\\d{3,}"));//t  三次
        System.out.println("1123".matches("\\d{3,}"));//f 一次


        System.out.println();
        System.out.println("ab".matches("\\w{3,6}"));//f  2次
        System.out.println("abcdf".matches("\\w{3,6}"));//t   5次
        System.out.println("0121235".matches("\\d{3,6}"));//f  7次
        System.out.println("123a".matches("\\d{3,6}"));//f 一次


    }
}
