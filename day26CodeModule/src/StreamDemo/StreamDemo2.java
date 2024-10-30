package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //stream流的中间方法

        //filter  过滤
        //limit   获取前几个元素
        //skip     跳过前几个元素
        //distinct  元素去重，依赖(hashcode和equals方法)，自定义对象要重写这两个方法
        //concat  合并a和b两个流为一个流
        //map      转换流中的数据类型
        //
        //

        //注意1:中间方法，返回新的stream流，原来的stream流只能使用一次，建议使用链式编程
        //注意2:修改stream流中的数据，不会影响原来集合或者数组中的数据

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤");

        //过滤  要指定过滤规则，参数是一个函数式接口Predicate
       /* list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //返回值位true:表示当前数据留下
                //false:当前数据舍弃

                //留下张开头的
                return s.startsWith("张");
            }
        }).forEach(s -> System.out.println(s));*/

        //简化，lambda表达式
        //原来的stream流只能使用一次，建议使用链式编程,不用创建新的变量
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

        ////limit   获取前几个元素
        //        //skip     跳过前几个元素

        System.out.println("==================");
        //获取前几个，参数为获取的前几个的个数
        list.stream().limit(3).forEach(s -> System.out.println(s));

        System.out.println("==================");
        //跳过前几个，参数为跳过的前几个的个数
        list.stream().skip(4).forEach(s -> System.out.println(s));
        System.out.println("==================");
        //获取中间的几个,跳过前几个和获取前几个结合
        list.stream().skip(4).limit(3).forEach(s -> System.out.println(s));

        //去重：distinct
        //底层依赖hashcode和equals方法
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"aaa","aaa","ahbdsa","bbb","bbb","ccc");
        list1.stream().distinct().forEach(s -> System.out.println(s));

        //ArrayList<Student> list2 = new ArrayList<>();


        //合并两个流为一个，数据类型尽可能相同，否则合并后会变成两者共同的父类，无法使用各自特有的功能
        Stream.concat(list1.stream(),list.stream()).forEach(s -> System.out.println(s));

        //转换流中的数据类型
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"张无忌-110","周芷若-120","赵敏-130","张强-140","张三丰-150","张翠山-160","张良-170","王二麻子-180","谢广坤-190");
        //形参Fuction为函数式接口
        //第一个类型:流中原本的数据类型
        //第二个类型:要转成之后的类型
        //不能是基本数据类型
        //apply的形参s:依次表示流里面的每一个数据
        //返回值:表示转换之后的数据

        ////当map方法执行完毕之后，流上的数据就变成了整数
        ////所以在下面forEach当中，s依次表示流里面的每一个数据，这个数据现在就是整数了
       /* list2.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                //字符串切割，参数为分割所依据的的分隔符，返回值为数组
                String[] split = s.split("-");
                //类型强制转化
                int age = Integer.parseInt(split[1]);
                return age;
            }
        }).forEach(s-> System.out.println(s));*/

        //改写为lambda表达式
        list2.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));




    }
}
