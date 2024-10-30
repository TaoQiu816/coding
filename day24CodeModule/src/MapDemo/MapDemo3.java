package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式：键值对对象遍历（Entry对象）

        //1.创建Map集合对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        map.put("尹志平","小龙女");
        map.put("郭靖","穆念慈");
        map.put("欧阳克","黄蓉");

        //3.通过键值对对象进行遍历
        //3.1通过方法获取所有的键值对对象，返回一个单列集合（Set集合）
        //返回Set集合，set集合泛型为Entry,Entry的泛型为键和值（泛型的嵌套）
        //Entry是Map的内部接口
        Set<Map.Entry<String, String>> entries = map.entrySet();
        /*//3.2遍历entries集合，得到其中的每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            *//*System.out.println(entry);*//*
            //3.3 利用entry调用get方法获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }*/

        /*//迭代器遍历
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }*/

        //lambda表达式
        entries.forEach( entry-> {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key+"="+value);
            }
        );

    }
}
