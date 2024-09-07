package day05_homework;

public class arrayHomework2 {
    public static void main(String[] args) {
        //现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。
        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};

        //存储最小值变量
        double min = arr[0];

        //遍历找最小值
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);

    }
}
