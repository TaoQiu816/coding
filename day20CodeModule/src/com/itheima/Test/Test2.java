package com.itheima.Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
            自己实现parseInt方法的效果，将字符串形式的数据转成整数。要求:
            字符串中只能是数字不能有其他字符最少一位，最多10位,0不能开头
        */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int num = 0;
        if (!s.matches("[1-9]\\d{0,9}")) {
            //格式错误
            System.out.println("字符串格式错误");
            //flag=false;
        } else {
            System.out.println("字符串格式正确");


            for (int i = 0; i < s.length(); i++) {
                //将每一位的整数字符转换成整数
                int c = s.charAt(i) - '0';
                //将每一位数字放入num中
                num = num * 10 + c;
            }

        }
        System.out.println(num);
    }


}
