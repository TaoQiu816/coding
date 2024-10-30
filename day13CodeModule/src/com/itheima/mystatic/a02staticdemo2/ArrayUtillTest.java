package com.itheima.mystatic.a02staticdemo2;

public class ArrayUtillTest {
    public static void main(String[] args) {
        //测试工具类的工具方法是否正确
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //通过工具类类名调用静态工具方法
        String str = ArrayUtill.printArr(arr);
        System.out.println(str);

        double[] arr1 = {80.5, 90.5, 99.0, 67, 53, 78.9, 55.6};
        double avg = ArrayUtill.getAverage(arr1);
        System.out.println(avg);
    }
}
