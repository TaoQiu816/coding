package com.itheima.test;

import java.util.Scanner;

public class test2Case1 {
    public static void main(String[] args) {
        //给送两个字符串A和B
        //如果能在若干次旋转操作之后A能变成B，返回TRUE
        //旋转操作，即将A整体左移一位，最左边的字符移动到最右边
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串");
        String str1 = sc.next();

        System.out.println("请输入第二个字符串");
        String str2 = sc.next();

        boolean result = check(str1, str2);
        System.out.println(result);


    }

    private static boolean check(String str1, String str2) {
        //一个字符串最多调整其长度次，否则就会重复
        for (int i = 0; i < str1.length(); i++) {
            str1 = rotate(str1);
            //System.out.println(str1);
            if (str1.equals(str2)) {
                return true;
            }


        }
        //所用情况都比较完之后表示false
        return false;
    }


    //字符串调整
    public static String rotate(String str) {
        //套路
        //如果看到要修改字符串的内容，有两个办法
        //1.用substring进行截取，把左边的字符截取出来拼接到右侧
        //2.把字符串先变成一个字符数组，然后调整字符数组里面的数据，最后再把字符数组变成字符串
        // StringBuilder sb = new StringBuilder();
        //获取字符串1索引之后的字符
        //sb.append();
        //将str的0索引字符放到最右侧
        String end = str.substring(1);
        char first = str.charAt(0);
        return end + first;
    }
}
