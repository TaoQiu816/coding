package MapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //LinkedHashMap  继承于hashmap
        //由键决定:有序、不重复、无索引。
        //这里的有序指的是保证存储和取出的元素顺序一致
        //原理:底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序。

        //创建集合
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        //添加元素
        lhm.put("a",123);
        lhm.put("a",123);//会保证键的唯一性
        lhm.put("b",456);
        lhm.put("d",654);
        lhm.put("c",852);

        System.out.println(lhm);
    }
}
