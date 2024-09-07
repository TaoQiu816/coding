package com.itheima.Test;

public class MethodTest3 {
    public static void main(String[] args) {
        //比较两个长方形的面积
        double area1 = getArea(11.2, 22.3);
        double area2 = getArea(11.7, 22.1);

        //比较
        if (area1 > area2){
            System.out.println("第一个长方形面积更大");
        }else {
            System.out.println("第一个长方形面积更大");

        }

    }

    //计算长方形的面积
    public static double getArea(double len, double width){
        double area = len*width;
        return area;
    }

}
