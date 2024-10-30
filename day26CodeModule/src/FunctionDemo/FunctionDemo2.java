package FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionDemo2 {
    public static void main(String[] args) {
        //集合中有以下数字，要求把他们都变成int类型
        //1 2 3 4 5

        //静态方法引用   类名：：方法名
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");


        //数据类型转换
        //map的参数是函数式接口Function
        /*list.stream().map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                return Integer.parseInt(s);
            }
        });*/
        List<Integer> newList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(newList);

        //方法已经存在
        //形参和返回值与抽象方法一样
        //方法功能与抽象方法一样，将字符串转换成整数


    }
}
