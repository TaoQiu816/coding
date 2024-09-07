package com.itheima.methoddemo.arraydemo;

public class Arrdemo1 {
    public static void main(String[] args) {
        //数组的遍历
        //定义数组、
        int[] array ={1,2,3,4,5};
        //获取数组所有元素
        //最大索引=数组长度-1
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //数组的长度通过  数组名.length调用
        System.out.println(array.length);

        //idea中遍历数组的快捷方式：array.fori
    }

}
