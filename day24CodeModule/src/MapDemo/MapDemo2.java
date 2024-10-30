package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式：通过键找值

        //先获取所有的键并存放于单列集合中，然后对每个键获取其值

        //1.创建Map集合对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        map.put("尹志平","小龙女");
        map.put("郭靖","穆念慈");
        map.put("欧阳克","黄蓉");

        //3.通过键找值
        //3.1获取所有的键，把这些键放到一个单列集合
        Set<String> keys = map.keySet();
        //对于这个单列集合有三种遍历方式（单列集合）
        /*for (String key : keys) {
            System.out.println(key);
            //利用键获得值,调用map的get方法即可
            String value = map.get(key);
            System.out.println(key+"="+value);
        }*/

        /*//单列集合迭代器遍历
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
        }*/

        //LAMBDA遍历
        keys.forEach( key->{
                String value = map.get(key);
                System.out.println(key+"="+value);
            }
        );
    }
}
