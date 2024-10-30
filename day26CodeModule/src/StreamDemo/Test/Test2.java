package StreamDemo.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        //创建一个ArrayList集合，并添加以下字符串，字符串中前面是姓名，后面是年龄
        //"zhangsan，23"
        //“lisi，24"
        //"wangwu，25"
        //保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值

        //创建集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhangsan,23","lisi,24","wangwu,25");

        //数据过滤，保留年龄大于等于24的:根据分隔符分割字符串后判断
        //分割后的每个部分是字符串，要进行类型转换，并且转换为整数
        /*list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1])>=24)
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        String name = s.split(",")[0];
                        return name;
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        int age = Integer.parseInt(s.split(",")[1]);
                        return age;
                    }
                }));*/
        Map<String, Integer> map = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(map);
    }
}
