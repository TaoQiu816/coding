package com.itheima.regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexDemo4 {
    public static void main(String[] args) {
        //本地数据爬取
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //Pattern:一个类，表示正则表达式，获取对象时不能直接把new，要使用其静态方法compile
        //Matcher:一个类，文本匹配器，作用按照正则表达式的规则取读取字符串，并且是从头开始读取
                    //在大串中找符合规则的子串

        //method1(str);

        //1.获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //2.获取文本匹配器的对象
        //拿着文本匹配器m读取str寻找符合规则p的子串
        Matcher m = p.matcher(str);

        //3.利用循环获取所有符合要求的子串，终止条件为：在str中找不到符合要求的子串，也就是find方法返回值为false
        while (m.find()){
            String s = m.group();
            System.out.println(s);
        }
    }

    private static void method1(String str) {
        //获取正则表达式对象,使用静态方法compile，参数为正则表达式字符串
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器的对象
        //m:文本匹配器的对象
        //str:大串
        //p:规则
        //表示m要在str中找符合p规则的小串
        Matcher m = p.matcher(str);


        //find方法：
        //拿着文本匹配器从头开始读取，寻找是否有满足规则的子串
        //如果没有，方法返回false
        //如果有，返回true。并在底层记录子串的其实索引和结束索引+1

        boolean b = m.find();

        //group方法
        //方法底层会根据find方法记录的索引进行字符串的截取
        //其实是用的是字符串截取方法 subString(起始索引，终止索引)；并且包头不包尾，包左不包右
        //返回截取的小字符串
        String s1 = m.group();
        System.out.println(s1);

        //在下次调用find方法的时候，会根据所记录的终止索引+1继续读取后面的内容
        //读取到第二个满足要求的子串，方法会继续返回true
        //并把第二个子串的起始索引和结束索引+1，进行记录
        b = m.find();
        //第二次调用group方法的时候，会根据find方法记录的索引再次截取子串
        String s2 = m.group();
        System.out.println(s2);
    }
}
