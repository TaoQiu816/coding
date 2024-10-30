package com.itheima.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class lambdaDemo3 {
    public static void main(String[] args) {
        //lambda表达式的省略格式

        //省略规则：可推导，可省略
        //参数类型可以省略不写
        //如果只有一个参数，参数类型可以省略，同时()也可以省略
        //如果lambda表达式的方法体只有一行，大括号、分号、return可以省略不写，需要同时省略

        Integer[] arr = {5, 6, 2, 3, 4, 1, 8, 7, 9};


        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;//升序
            }
        });

        //完整l表达式格式
        Arrays.sort(arr,(Integer o1, Integer o2) ->{
                    return o1-o2;//升序
                }
        );*/

        //完整l表达式省略格式
        Arrays.sort(arr, (o1, o2) -> o1 - o2);//升序  //方法体只有一行，同时省略大括号，return，分号;

        System.out.println(Arrays.toString(arr));
    }
}
