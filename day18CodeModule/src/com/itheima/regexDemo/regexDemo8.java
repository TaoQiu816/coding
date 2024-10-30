package com.itheima.regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexDemo8 {
    public static void main(String[] args) {
        //贪婪爬取和非贪婪爬取
        /*
            只写+和*表示贪婪匹配

            +? 非贪婪匹配
            *? 非贪婪匹配

            贪婪爬取:在爬取数据的时候尽可能的多获取数据
            非贪婪爬取:在爬取数据的时候尽可能的少获取数据

            ab+:
            贪婪爬取:abbbbbbbbbbbb
            非贪婪爬取:ab
        */
        String s = "Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
                "经历了很多版木，目前企业中用的最多的是]ava8和]ava11，因为这两个是长期支持版木。" +
                "下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //默认贪婪匹配
        String regex1 = "ab+";
        //非贪婪匹配，在+后面加一个问号
        String regex2 = "ab+?";

        Pattern p1 = Pattern.compile(regex1);
        Pattern p2 = Pattern.compile(regex2);

        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        while (m1.find()){
            System.out.println(m1.group());
        }
        while (m2.find()){
            System.out.println(m2.group());
        }
    }
}
