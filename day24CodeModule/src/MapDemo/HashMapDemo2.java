package MapDemo;

import java.util.*;
import java.util.function.BiConsumer;

public class HashMapDemo2 {
    public static void main(String[] args) {
        //Map集合案例-统计投票人数
        //需求
        //某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是(A、B、C、D),每个学生只
        //能选择一个景点，请统计出最终哪个景点想去的人数最多。

        //可定义map集合，键为景点名字，值为被投票次数
        //同学投票时，先看投票的景点（键）存在与否，存在则将值+1
        //若不存在该键，即第一次出现，则添加到集合中，并将值设置为1


        //1.模拟投票
        //定义数组存储四个景点，利用随机数模拟80个同学投票
        String[] arr = {"A", "B", "C", "D"};
        Random r = new Random();
        //存储投票结果
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            //随机选取景点之一
            int index = r.nextInt(4);

            //存入投票结果的集合
            list.add(arr[index]);
        }

        //2.统计投票结果
        //如果要统计的东西比较多，不方便使用计数器思想，可定义map集合，利用集合进行统计
        //定义map集合
        Map<String, Integer> map = new HashMap<>();
        //遍历投票集合list，并添加到键值对
        for (String s : list) {

            if (map.containsKey(s)) {
                //若键s已经存在（已有人投过票）,键+1，表示又被投票了一次
                map.put(s, map.get(s) + 1);
                //map.get(object key)返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null
            } else {
                //判断s是否已经存在，若不存在则直接添加为键，值为1
                map.put(s, 1);
            }
        }

        System.out.println(map);

        //首先得出map集合中谁的值最大
        //遍历
        //每一个键的值都可能为0，并且值的最小值是0
        int max = 0;//记录值的最大值
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            max = max > entry.getValue() ? max : entry.getValue();
        }

        //根据得出的最大键的值，打印出对应景点
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
