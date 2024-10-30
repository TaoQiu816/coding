package StreamDemo.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        //数据过滤
        //定义一个集合，并添加一些整数1，2，3，4，5，6，7，8，9，10
        //过滤奇数，只留下偶数。
        //并将结果保存起来

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

        //过滤数据并存下
        //filter方法返回值为boolean，为true时保留数据
        //apply方法的参数：流中数据的个数，要和数组的长度一致
        List<Integer> newList = list.stream()
                //偶数返回true，保留
                .filter(s -> s % 2 == 0)
                //数据一般收集到集合之中
                .collect(Collectors.toList());
        System.out.println(newList);

    }
}
