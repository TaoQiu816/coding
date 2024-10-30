package com.itheima.regexDemo;

public class regexDemo11 {
    public static void main(String[] args) {

        //需求:把重复的内容 替换为 单个的
        //学学                学
        //编编编编            编
        //程程程程程程        程

        String str = "我要学学编编编编程程程程程程";


        //string方法中的形参若是regex则可以识别正则表达式
        //由于要识别重复的内容，因此将首字符作为分组，后面使用此分组中的数据，并且首字符后最少重复一次
        String regex = "(.)\\1+";

        //(.)表示把重复内容的第一个字符看成一组
        //\\1表示第一字符再次出现
        //+   至少一次
        //$1  表示把正则表达式中的第一组的内容再拿出来用（正则表达式之外）

        String s = str.replaceAll(regex, "$1");//在正则表达式外部使用正则表达式的分组数据
        System.out.println(s);

    }
}
