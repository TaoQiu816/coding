package day04_homework;

import java.util.Scanner;

public class loopHomework2 {
    public static void main(String[] args) {
        //需求：键盘录入两个数字，表示一个范围。
        //
        //​           统计这个范围中。
        //
        //​	    既能被3整除，又能被5整除数字有多少个？
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int number2 = sc.nextInt();

        //比较两者获得范围的上下界(三元运算符方法)
        int max = number1 > number2 ? number1 : number2;
        int min = number1 < number2 ? number1 : number2;

        //计数变量
        int count = 0;

        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }

        System.out.println("在" + min + "到" + max + "范围中既能被3整除又能被5整除的数字共有" + count + "个");


    }
}
