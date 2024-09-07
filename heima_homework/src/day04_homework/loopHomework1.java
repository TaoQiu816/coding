package day04_homework;

import java.util.Scanner;

public class loopHomework1 {
    public static void main(String[] args) {
        //	键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。
        //键盘录入范围
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int number2 = sc.nextInt();

        //比较两者获得范围的上下界(三元运算符方法)
        int max = number1>number2 ? number1 : number2;
        int min = number1<number2 ? number1 : number2;

        //或者IF语句方法


        //求和变量
        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum = sum + i;
        }

        System.out.println("在" + min + "到" + max + "范围中的数字之和为" + sum);

    }
}
