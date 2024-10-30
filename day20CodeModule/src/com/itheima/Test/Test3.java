package com.itheima.Test;

public class Test3 {
    public static void main(String[] args) {
        /*

            定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制

         */

        System.out.println(tobinarystring(8));
        System.out.println(Integer.toBinaryString(8));
    }

    public static String tobinarystring(int num) {
        //不断除以2取余数，并且逆序拼接，直至被除数为0

        //存放最终结果（有字符串拼接）
        StringBuilder sb = new StringBuilder();

        while (true) {
            //判断是否结束除法
            if (num == 0) {/////////
                break;
            }
            //取余数，并且要逆序拼接，后得到的余数在前面
            int remainder = num % 2;
            System.out.println(remainder);
            num = num / 2;
            System.out.println(num);
            sb.insert(0, remainder);

        }
        return sb.toString();
    }
}
