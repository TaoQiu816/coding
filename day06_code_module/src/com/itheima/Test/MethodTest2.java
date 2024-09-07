package com.itheima.Test;

import java.util.Scanner;

public class MethodTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radiuis = sc.nextDouble();
        getArea(radiuis);

    }
    //方法：求圆的面积
    public static void getArea(double rsdius){
        double result = rsdius*rsdius*3.14;
        System.out.println(result);
    }
}
