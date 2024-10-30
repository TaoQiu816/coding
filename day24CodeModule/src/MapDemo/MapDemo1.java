package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        //Map是双列集合的顶层接口，它的功能是全部双列集合都可以继承使用的
        //添加元素时，成对添加键值对
        //键不可重复，值可以重复

        //常用API
        //V   put(K key,V   value)：     添加元素
        //V   remove(Object key)：       根据 键 删除键值对元素,并返回值
        //void   clear()：               移除所有的键值对元素
        //boolean containsKey(Object key)：      判断集合是否包含指定的键             |
        //boolean containsValue(Object value)：  判断集合是否包含指定的值             |
        //boolean isEmpty()：                    判断集合是否为空                     |
        //int size()：                           集合的长度，也就是集合中键值对的个数 |

        //创建map集合对象，Map是接口，并且有两个泛型，要通过其实现类创建对象
        Map<String,String> m = new HashMap<>();

        //添加元素,put方法返回值string
        //细节：
        //功能是  添加、覆盖（键不存在就添加，存在就覆盖其值）
        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中
        //在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，并把被覆盖的值进行返回。、
        System.out.println(m.put("郭靖", "黄蓉"));//NULL，正常添加，返回null，因为没有覆盖任何数据
        System.out.println(m.put("韦小宝", "木健平"));//NULL
        System.out.println(m.put("尹志平", "小龙女"));//NULL

        System.out.println(m.put("韦小宝", "双儿"));//木健平(被覆盖的值被返回)


        //打印集合
        System.out.println(m);

        // 根据 键 删除键值对元素,并返回值
        System.out.println(m.remove("郭靖"));
        System.out.println(m);

       /* //清空
        m.clear();
        System.out.println(m);*/

        //判断是否包含
        //根据键判断
        System.out.println(m.containsKey("韦小宝"));
        System.out.println(m.containsKey("韦小宝2"));
        //根据值判断
        System.out.println(m.containsValue("双儿"));
        System.out.println(m.containsValue("双儿2"));

        //判断是否为空
        System.out.println(m.isEmpty());

        //获取集合大小
        System.out.println(m.size());


    }
}
