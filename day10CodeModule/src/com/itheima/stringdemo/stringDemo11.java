package com.itheima.stringdemo;

import java.util.Scanner;

public class stringDemo11 {
    public static void main(String[] args) {
        //身份证信息查看
        Scanner sc = new Scanner(System.in);
        System.out.println("输入身份证号码");
        String Id = sc.next();

        //截取出生年月
        String year = Id.substring(6, 10);
        String month = Id.substring(10, 12);
        String day = Id.substring(12, 14);

        System.out.println("身份信息为");
        System.out.println("出生年月日：" + year + "年" +month+"月"+day+"日");
        //截取性别
        //ASCII码表中0到9为48~57
        char gender = Id.charAt(16);
        //从数字字符转换为原有数字，即-48
        //'0' --->  48
        //'1' --->  49
        //'2' --->  50
        //'3' --->  51
        //'4' --->  52
        //'5' --->  53
        //'6' --->  54
        //'7' --->  55
        //'8' --->  56
        //'9' --->  57
        int genderNum = gender - 48;
        if (genderNum%2==0){
            //偶数为女
            System.out.println("性别为：女");
        }else {
            //奇数为女
            System.out.println("性别为：男");
        }


    }
}
