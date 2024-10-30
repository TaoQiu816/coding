package com.itheima.stringdemo;

import java.util.Scanner;

public class stringDemo12 {
    public static void main(String[] args) {
        //敏感词替换
        //string replace(旧值，新值)
        //注意只有返回值才是替换之后的结果，不会影响原有字符串
        Scanner sc = new Scanner(System.in);
        String talk = sc.next();

        //定义敏感词库
        String[] dirty={"TMD","CNM","SB","MLGB"};
        //在敏感词库中遍历替换
        //String newTalk="";
        for (int i = 0; i < dirty.length; i++) {
            talk = talk.replace(dirty[i], "***");
        }


        System.out.println(talk);
    }
}
