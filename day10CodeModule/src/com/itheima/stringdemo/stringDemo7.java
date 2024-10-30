package com.itheima.stringdemo;

public class stringDemo7 {
    public static void main(String[] args) {
        //拼接字符串
        //定义方法，把int数组中的数据按照指定格式拼接成一个字符串返回
        //调用方法并在控制台输出
        int[] arr = {1,2,3,4,5,6};
        String result = arrToString(arr);
        System.out.println(result);
    }
    public static String arrToString(int[] arr){
        //数组为空返回空
        if (arr == null){
            return " ";
        } else if (arr.length==0) {
            //数组长度为0
            return "[]";
        }else {//正常数组
            String result = "[";
            for (int i = 0; i < arr.length; i++) {
                //最后一个索引时只拼接数组元素
                if (i == arr.length -1){
                    result = result + arr[i];
                }else {
                    //最后一个索引之前的元素要拼接“，”
                    result = result + arr[i] + ",";
                }
            }
            //将数组元素拼接完之后，再拼接]
            result = result + "]";
            return result;
        }
    }
}
