package com.itheima.stringdemo;



import java.util.Scanner;

public class stringDemo9 {
    public static void main(String[] args) {
        //金额转换
        //输入阿拉伯数字金额，转换成七位大写金额
        Scanner sc = new Scanner(System.in);
        int money;
        //变量只在所属的大括号有效，所以money必须定义在循环之外

        while (true) {
            System.out.println("请输入金额");
            money = sc.nextInt();
            //七位数，限制范围
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                //超出范围，重新输入
                System.out.println("金额错误，请重新输入");
            }
        }

        //获取输入金额的每一位
        //从右往左获取存储金额的每一位到字符串中并转换为大写
        String moneyStr = "";
        while (money!=0){//直到money被除的只剩0就获得了money的每一位
            int x = money % 10;

            String capitalNumber = getCapitalNumber(x);
            //由于从右往左取每一位，所以新获得的大写数字拼接在左侧
            moneyStr = capitalNumber + moneyStr;
            //去掉所获取的位，更新数字用于求下一位
            money=money/10;
        }
        System.out.println(moneyStr);
        System.out.println(moneyStr.length());

        //将获得的大写数字与单位进行拼接
        //将moneystr拼成7位
        //先记录字符串长度
        int flag = moneyStr.length();
        for (int i = 0; i <= 7-flag; i++) {
            //左侧补零
            moneyStr = getCapitalNumber(0) + moneyStr;
        }
        System.out.println(moneyStr);

        //定义金额单位字符串数组
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        //获得转换金额
        String result = "";
        for (int i = 0; i < arr.length; i++) {//数字+单位
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);



    }

    //将阿拉伯数字转换成中文大写
    //查表的思想，查表法
    public static String getCapitalNumber(int number) {
        //数组存放所有大写数字
        String[] str = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String capitalNumber = str[number];
        return capitalNumber;

    }

}
