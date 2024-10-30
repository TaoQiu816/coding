package day06_homework;

import java.util.Scanner;

public class methodHomework1 {
    public static void main(String[] args) {
        //取绝对值
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println(getReal(num));
    }

    //
    public static double getReal(double num){
        if (num < 0){
            return -num;
        }else {
            return num;
        }
    }


}
