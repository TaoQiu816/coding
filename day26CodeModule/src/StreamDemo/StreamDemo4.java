package StreamDemo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo4 {
    public static void main(String[] args) {
        ////collect(Collector collector)   收集流中的数据，放到集合中(List Set Map)
        //        //

        //转换成map

        //切记细节：键不能重复，否则就会报错
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-男-15","周芷若-女-14","赵敏-女-15","张强男-18","张三丰-男-20","张翠山-男-22","张良-男-95","王二麻子-男-6","谢广坤-男-40");


        //收集所有男
        List<String> list1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(list1);

        //转换成set集合会去掉重复的元素
        Set<String> set1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(set1);


        Map<Object, Object> map1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).
                //toMap :参数一表示键的生成规则
                //参数二表示值的生成规则
                //参数一:
                    //Function泛型一:表示流中每一个数据的类型
                    //泛型二:表示Map集合中键的数据类型

                    //方法apply形参:依次表示流里面的每一个数据
                    //方法体:生成键的代码
                    //返回值:已经生成的键

                //参数二:
                    //Function泛型一:表示流中每一个数据的类型
                    //泛型二:表示Map集合中值的数据类型

                    //方法apply形参:依次表示流里面的每一个数据
                    //方法体:生成值的代码
                    //返回值:已经生成的值
                collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split("-")[0];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[2]);
            }
        }));

        System.out.println(map1);

        //简化成lambda表达式,括号内指定键和值的生成规则
        Map<String, Integer> map2 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(map2);


    }
}
