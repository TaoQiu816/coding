package day04_homework;

import java.util.Scanner;

public class switchHomework1 {
    public static void main(String[] args) {
        //模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。
        //
        //要求：
        //
        //​	键盘录入三个整数,其中前两个整数代表参加运算的数据，第三个整数为要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:
        //
        //​		请输入第一个整数: 30
        //
        //​		请输入第二个整数: 40
        //
        //​		请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1
        //
        //​		控制台输出:30+40=70

        //输入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int number2 = sc.nextInt();
        System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法):");
        int operator = sc.nextInt();

        //switch语句对运算分类
        switch (operator){
            case 1:
                //加法
                System.out.println(number1+"+"+number2+"="+(number1+number2));
                break;
            case 2:
                //减法
                System.out.println(number1+"-"+number2+"="+(number1-number2));
                break;
            case 3:
                //乘法
                System.out.println(number1+"*"+number2+"="+(number1*number2));
                break;
            case 4:
                //除法
                System.out.println(number1+"/"+number2+"="+(number1*1.0/number2));
                break;
            default:
                System.out.println("输入的运算错误");
        }
    }
}
