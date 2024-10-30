package com.itheima.mystatic.a02staticdemo2;

public class ArrayUtill {
    //工具类规则：构造方法必须私有化（为了不让外界创建对象，因为创建工具类的对象没有意义）

    private ArrayUtill() {

    }

    //成员方法(工具方法)静态化，供所有人使用
    public static String printArr(int[] arr) {
        //拼接数组并返回字符串
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            //最后一个元素只拼接
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");

            }
        }
        sb.append("]");
        return sb.toString();
    }

    //返回平均分（浮点型数组）
    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }
}
