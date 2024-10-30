package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //键盘输入字符串，打乱里面的内容
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //调用打乱
        String strNew = remixStr(str);
        System.out.println(strNew);



    }
    //打乱字符串的内容
    public static String remixStr(String str){
        //可根据随机索引打乱字符数组的内容
        //转换为字符数组
        char[] c = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i < c.length; i++) {
            //从0索引开始，与一个随机索引的字符交换
            //等所有索引都交换完毕之后，字符串就打乱了
            int randomIndex = r.nextInt(c.length);
            //暂存当前索引数据
            char temp = c[i];
            //交换数据
            c[i] = c[randomIndex];
            c[randomIndex] = temp;
        }

        String result =new String(c);
        return result;
    }
}
