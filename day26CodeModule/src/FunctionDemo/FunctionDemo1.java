package FunctionDemo;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {
        //对数组进行倒顺序排序
        Integer[] arr = {3,5,4,1,6,2};

        //匿名内部类
        //Arrays工具类中的sort方法，指定排序规则
        //指定排序规则时要使用包装类数组，因为基本数据类型数组不支持使用 Comparator
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                //o1是当前数据
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));*/

        //lambda表达式,comparator时函数式接口，此时才可以用表达式
        /*Arrays.sort(arr,(o1, o2) -> o2-o1);
        System.out.println(Arrays.toString(arr));*/

        //方法引用，4个条件
        //1.引用处需要是函数式接口
        //2.被引用的方法需要已经存在
        //3.被引用的方法的形参和返回值需要与抽象方法的形参和返回值保持一致
        //4.被引用方法的功能需要满足当前的需要

        //静态方法也要通过类名调用
        //什么是方法引用?
        //把已经存在的方法拿过来用，当做函数式接口中抽象方法的方法体
        //::是什么符号?
        //方法引用符
        Arrays.sort(arr,FunctionDemo1::subtraction);
        System.out.println(Arrays.toString(arr));
    }
    public static int subtraction(int num1,int num2){
        return num2-num1;
    }
}
