package com.itheima.test;

import java.util.Random;

public class test4 {

    public static void main(String[] args) {
        //生成验证码
        //内容可大写可小写还可以是数字
        //长度为5，4个字母，1个数字，数字位置任意
        //可先把数字放在最后，再把数字与前面的随机索引字符交换位置
        Random r = new Random();

        //将大小写字母都存放在数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i<=25){
                //前26 个放小写字母
                chs[i] = (char) (97 + i);
            }else {
                //后26个存放大写字母
                chs[i] = (char) (65 + i -26);
            }
        }
        //前四个字母验证码
        //StringBuilder sb = new StringBuilder();
        String str = "";
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(52);
            str = str + chs[index];
        }
        //最后一位数字
        str = str +r.nextInt(10);
        //数字与前四个随机交换
        char[] c = str.toCharArray();
        int randomIndex = r.nextInt(4);
        char temp = c[randomIndex];
        c[randomIndex] = c[c.length-1];
        c[c.length-1]=temp;

        //重新转换为字符串
        String result = new String(c);
        System.out.println(result);



    }


}
