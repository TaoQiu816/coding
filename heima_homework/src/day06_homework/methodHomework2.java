package day06_homework;

import java.util.Scanner;

public class methodHomework2 {
    //键盘录入一个正整数
    //
    //定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
    //
    //在main方法中打印该数字是几位数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();

        System.out.println(getCount(num));

    }
    public static int getCount(int num){

        //计数变量
        int count =0;
        while (num!=0){
            count++;
            num = num/10;
        }
        return count;
    }
}
