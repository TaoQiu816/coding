package com.itheima.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //转换罗马数字
        //键盘录入字符串，长度小于等于9，只能是数字，将内容变成罗马数字
        //如果是0，则转换为长度为0的字符串""

        //1.键盘录入字符串，满足长度与数字要求
        String str = stringInput();
        //2.转换阿拉伯数字
        //将字符串每一位通过查表转换为罗马数字
        String strRome = numberNoRome(str);
        System.out.println(strRome);
    }

    private static String stringInput() {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true) {

            System.out.println("请输入长度不超过9的数字型字符串：");
            str = sc.next();
            //标记输入书否合法
            boolean flag = true;

            //判断长度
            if (str.length() <= 9) {
                //长度合法，继续判断是否满足内容的数字要求
                for (int i = 0; i < str.length(); i++) {
                    //判断是否在数字0~9范围之中
                    if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                        //若不是数字，则标记非法
                        //若是数字，则不执行任何操作，继续判断下一个索引是否数字
                        System.out.println("字符串内容非法，重新输入");
                        flag = false;
                        break;
                    }

                    //
                }

            } else {
                //长度不合法，标记非法，重新输入
                flag = false;
                System.out.println("长度非法，重新输入");
                //continue;
            }
            //
            if (flag) {
                //若合法，输入失败，则跳出循环，不用重新输入
                break;
            }
            //


        }
        //输入成功 返回字符串
        return str;
    }

    //数字转换为罗马数字
    public static String numberNoRome(String str){
        StringBuilder sb = new StringBuilder();

        //存储罗马数字，索引与数字对应
        String[] rome = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        //查表获取数字对应的罗马数字
        for (int i = 0; i < str.length(); i++) {
            //获取阿拉伯数字
            int index = str.charAt(i) - 48;
            sb.append(rome[index]);
        }
        return sb.toString();
    }


}
