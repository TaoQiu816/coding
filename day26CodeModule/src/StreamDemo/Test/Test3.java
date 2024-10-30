package StreamDemo.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        //现在有两个ArrayList集合
        //第一个集合中:存储6名男演员的名字和年龄。第二个集合中:存储6名女演员的名字和年龄。
        //姓名和年龄中间用逗号隔开。比如:张三,23
        //要求完成如下的操作:
        //1，男演员只要名字为3个字的前两人
        //2，女演员只要姓杨的，并且不要第一个
        //3，把过滤后的男演员姓名和女演员姓名合并到一起
        //4，将上一步的演员信息封装成Actor对象。
        //5，将所有的演员对象都保存到List集合中。
        //备注:演员类Actor，属性有:name，age

        //创建集合存储信息
        ArrayList<String> boyActor =new ArrayList<>();
        ArrayList<String> girlActor =new ArrayList<>();

        //添加信息
        Collections.addAll(boyActor,"彭于晏,30","邓超,35","李晨,40","孙红雷,40","王宝强,37","陈赫,28");
        Collections.addAll(girlActor,"倪妮,28","张也,20","杨乐乐,23","古力娜扎,25","杨洋杨,37","杨哈哈,28");

        //过滤男演员数据，只要名字为3个字的前两人,处理完后获取这歌流
        Stream<String> stream1 = boyActor.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);

        //只要姓杨的并且不要第一个,处理完后获取这个流
        Stream<String> stream2 = girlActor.stream()
                .filter(s -> s.charAt(0) == '杨')
                .skip(1);


        //合并两个流
        //Stream<String> stream = Stream.concat(stream1, stream2);

        //封装成actor对象并存入list
        //遍历流的每个元素，添加到集合中
        //ArrayList<Actor> actorList = new ArrayList<>();
        /*stream.forEach(s -> {
            Actor actor = new Actor(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
            actorList.add(actor);
        });*/
        /*stream.forEach(s ->
            actorList.add(new Actor(s.split(",")[0],Integer.parseInt(s.split(",")[1])))
        );*/

        //类型转换：使用map方法
        /*stream.map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                //s表示流中的每一个数据

                return new Actor(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
            }
        });*/
        //合并流，流数据类型转换，收集到集合
        List<Actor> actorList = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0]
                        , Integer.parseInt(s.split(",")[1])))
                //流中的数据类型转换完成之后，再将数据收集成集合
                .collect(Collectors.toList());
        System.out.println(actorList);


    }
}
