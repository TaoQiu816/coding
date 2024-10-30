package com.itheima.test;

public class test6 {
    public static void main(String[] args) {
        //给定字符串由若干单词组成，但此后用一些空格字符隔开
        //返回字符串中最后一个单词的长度，单词不包含空格
        String s = "hello world";
        //转换成数组
        //char[] chs = s.toCharArray();
        //记录空格索引
        int index=0;
        //反向遍历更快
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i) == ' '){
                //记下空格位置
                index = i;
            }
        }

        int count = s.length()-index-1;
        System.out.println(count);

    }
}
