package StreamDemo;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class StreamDemo3 {
    public static void main(String[] args) {
        //终结方法
        //void forEach(consumer action)   遍历
        //long count()    统计
        //toArray()    收集流中的数据，放到数组中
        //collect(Collector collector)   收集流中的数据，放到集合中(List Set Map)
        //

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤");

        //遍历
        ////Consumer的泛型:表示流中数据的类型
        ////accept方法的形参s:依次表示流里面的每一个数据
        ////方法体:对每一个数据的处理操作(比如打印)
      /*  list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        list.stream().forEach(s -> System.out.println(s));

        //统计:统计数据个数
        System.out.println(list.stream().count());

        ////toArray()    收集流中的数据，放到数组中
        //空参：默认是object数组
        Object[] arr = list.stream().toArray();
        System.out.println(Arrays.toString(arr));

        //有参：参数是IntFunction接口，一个函数式接口
        //IntFunction的泛型：具体数据类型的数组
        //apply方法的参数：流中数据的个数，要和数组的长度一致
        //apply返回值：具体类型的数组

        ////toArray方法的参数的作用:负责创建一个指定类型的数组
        ////toArray方法的底层，会依次得到流里面的每一个数据，并把数据放到数组当中
        ////toArray方法的返回值:是一个装着流里面所有数据的数组

        String[] arr1 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr1));

        //简化写法
        String[] arr2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));


        //转换成list
        System.out.println("tolist");
        List<String> collect = list.stream().collect(Collectors.toList());
        System.out.println(collect);

        //转换成set，会去掉重复的元素
        System.out.println("toset");
        Set<String> collect1 = list.stream().collect(Collectors.toSet());
        System.out.println(collect1);

    }
}
