package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo4 {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式：Lambda表达式遍历
        //default void forEach(Biconsumer<?super K,superV> action)
        ///结合Lambda遍历Map集合

        //1.创建Map集合对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("尹志平", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");

        //BiConsumer是一个函数式接口，可以使用Lambda表达式
        //accept接受的参数第一个是键，第二个是值
        /*map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value);
            }
        });*/

        //简化为lambda表达式
        //底层：
        //forEach其实就是利用第二种方式进行遍历，依次得到每一个键值对
        //再调用accept方法
        map.forEach((key, value) -> System.out.println(key + "=" + value));


    }
}
