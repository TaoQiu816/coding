package com.itheima.mathDemo1;

import java.util.Scanner;

public class mathdemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPrime(number));
    }

    //判断质数与否
    public static boolean isPrime(int number) {
        int count = 0;
        ////判断质数：思路
        //一个数的两个因子中，一定有一个是大于等于其平方根且另一个是小于等于平方根的
        //从而循环只需从2到sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if (number % i == 0) {
                System.out.println(count);
                return false;
            }
        }
        System.out.println(count);
        return true;


    }
}
