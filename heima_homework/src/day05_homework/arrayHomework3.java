package day05_homework;

import java.util.Random;

public class arrayHomework3 {
    public static void main(String[] args) {
        //创建一个长度为6的整数数组。请编写代码，
        //随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。

        //动态初始化
        int[] arr = new int[6];

        //生成随机数，通过遍历存入数组
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        //输出生成的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //求和
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }
        System.out.println(sum);
    }
}
