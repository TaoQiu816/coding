package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        //Stream流的使用步骤:

        //先得到一条Stream流(流水线)，并把数据放上去
        //使用中间方法对流水线上的数据进行操作
        //使用终结方法对流水线上的数据进行操作

        //中间方法使用过后还能调用其他方法，终结方法使用后不能再是用其他方法

        //获取stream流的方法：
        //单列集合  default stream<E> stream()   Collection中的默认方法
        //双列集合   无 无法直接使用stream流(先转换成单列集合)
        //数组    public static<T>Stream<T> stream(T[] array)  Arrays工具类中的静态方法
        //-堆零散数据  public static<T>stream<T> of(T... values)  stream接口中的静态方法


        //单列集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhangsan","lisi","wangwu","zzzz","zhioscdhc","zniuodhnwo");
        /*//获取一条流水线，并把集合中的数据放到流水线上
        Stream<String> stream = list.stream();
        //使用终结方法打印流水线上的所有数据
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //s依次表示流水线上的每一个数据
                System.out.println(s);
            }
        });*/

        //简化写法：链式编程、lambda表达式
        list.stream().forEach(s -> System.out.println(s));


        //双列集合，hashmap不保证存取顺序一致,根据哈希值得出存储的位置
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);
        hm.put("eee",555);

        //获取stream流
        //法一：获取键的单列集合，并放在流水线上
        hm.keySet().stream().forEach(s -> System.out.println(s));

        //法二：获取键值对对象的单列集合，并放在流水线上
        hm.entrySet().stream().forEach(s -> System.out.println(s));


        //数组
        int[] str ={1,2,3,4,5,6,7,8,9,10};
        //使用Arrays工具类中的方法获取stram流，基本数据类型、引用数据类型均可以
        Arrays.stream(str).forEach(s -> System.out.println(s));

        String[] strArr = {"aaa","bbb","ccc","ddd","eee"};
        Arrays.stream(strArr).forEach(s -> System.out.println(s));


        //零散数据：前提需要这些数据是同种数据类型
        //Stream中的of方法，
        // 细节：参数是可变参数，也可以传递数组
        //但是传递的数组必须是引用数据类型而不是基本数据类型，否则就会将整个数组当作一个元素放到stream中
        Stream.of(1,2,3,4,5).forEach(s -> System.out.println(s));
        Stream.of("aaa","bbb","ccc","ddd","eee").forEach(s -> System.out.println(s));
    }
}
