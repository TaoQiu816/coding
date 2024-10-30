package com.itheima.regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexDemo7 {
    public static void main(String[] args) {
         /*
            有如下文本，按要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台


            需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
            需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
            需求3:爬取除了版本号为8，11.17的Java文本，
        */
        String s = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //1.定义正则表达式
        //?理解为占位符，指代前面的数据，此处为Java
        //=表示在java后面要跟随的数据
            //但是只在读取的时候要用到，获取子串的时候只获取前半部分

        //需求1：
        String regex1 = "((?i)Java)(?=8|11|17)";

        //：表示在java后面要跟随的数据，获取子串时，后面的部分也要获取
        //需求2：
        String regex2 = "((?i)Java)(?:8|11|17)";//或写为((?i)Java)(8|11|17)

        //!表示在java后面要跟随的数据，表示寻找不含！后面所跟部分的数据
        //需求3：
        String regex3 = "((?i)Java)(?!8|11|17)";

        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(s);
        while (m1.find()){
            String str = m1.group();
            System.out.println(str);
        }
        System.out.println("==========================================");


        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(s);
        while (m2.find()){
            String str = m2.group();
            System.out.println(str);
        }
        System.out.println("==========================================");

        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(s);
        while (m3.find()){
            String str = m3.group();
            System.out.println(str);
        }
        System.out.println("==========================================");
    }
}
