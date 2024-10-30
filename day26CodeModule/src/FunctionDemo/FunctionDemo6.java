package FunctionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class FunctionDemo6 {
    public static void main(String[] args) {
        //引用数组的构造方法
        //格式：  数据类型[]::new

        //细节：创建的数组的类型，要与流中的数据类型保持一致

        //集合中存一些整数，收集到数组当中
        ArrayList<Integer> list =new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);

        //匿名内部类写法
        //泛型是指定类型的数组,泛型不能写基本数据类型
        /*Integer[] arr = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                //抽象方法的形参流中数据的个数，要和数组的长度一致
                return new Integer[value];
                //返回值是创建的指定类型的数组（创建的数组对象，长度指定为value）
            }
        });
        System.out.println(Arrays.toString(arr));*/

        //此时会创建一个integer类型的数组，数组长度与流中的数据个数保持一致
        //并把流中的数据放到数组之中
        ////细节：创建的数组的类型，要与流中的数据类型保持一致
        Integer[] arr1 = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr1));

    }
}
