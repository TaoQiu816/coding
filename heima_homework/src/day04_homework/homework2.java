package day04_homework;

<<<<<<< HEAD
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        //让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数：");
        int number1 = sc.nextInt();
        System.out.println("请输入第一个整数：");
        int number2 = sc.nextInt();
        System.out.println("请输入第一个整数：");
        int number3 = sc.nextInt();

        //存储最小值
        int min;

        /*//三元运算符
        min = (number1<number2? number1 :number2);
        min = (min<number3 ? min : number3);

        System.out.println(min);*/

        //if else语句
        if (number1 < number2 && number1 < number3) {
            min = number1;
        } else if (number2 < number1 && number2 < number3) {
            min = number2;
        } else {
            min = number3;
        }
        System.out.println("最小值为" + min);
    }
=======
public class homework2 {
>>>>>>> 26330c7a267c6c168e959a386252cdf884a3a5bc
}
