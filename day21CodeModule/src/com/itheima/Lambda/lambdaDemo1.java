package com.itheima.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class lambdaDemo1 {
    public static void main(String[] args) {
        //lambda表达式可用于简化匿名内部类的书写

        Integer[] arr = {5,6,2,3,4,1,8,7,9};

       /* Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;//升序
            }
        });*/

        //简化后：删除接口名、方法名,在方法的形参和方法体 大括号之间添加一个箭头
        Arrays.sort(arr,(Integer o1, Integer o2) ->{
                return o1-o2;//升序
            }
        );


        System.out.println(Arrays.toString(arr));
    }
}
