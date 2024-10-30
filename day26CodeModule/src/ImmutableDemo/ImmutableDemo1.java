package ImmutableDemo;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        //不可变集合：使用接口的of方法创建不可变集合
        //创建不可变的List集合
        //"张三"，"李四"，"王五"，"赵六"

        List<String> list = List.of("zhangsan", "lisi", "wangwu");
        System.out.println(list);
        //遍历同前，一旦创建之后，无法进行修改，只能进行查询

        //set无索引，并且元素不能重复
        //细节：
        //当要获取一个不可变的Set集合时，里面的参数不可以重复，否则会报错
        Set<String> set = Set.of("zhangsan", "lisi", "wangwu");
        System.out.println(set);

        //细节：
        //键不可重复，否则会报错
        //map里面的of方法参数是有上限的，因为不是可变参数，只是单纯的重载，最多只能传递20个参数，10个键值对
        //原因：键值对有两个参数：值和对，但是方法的可变参数中最多只能有一个

        Map<String, String> map = Map.of("zhangsan", "河南", "lisi", "hebei", "wangwu", "hubei ");
        System.out.println(map);

        //如果想创建键值对大于10的不可变集合map，可使用map中的ofEntries方法，这是将一对键值对看成一个整体，从而可以使用可变参数
        //首先创建一个普通的map集合
        //通过entryset方法获取其中的所有键值对
        //将键值对对象集合转换成数组（因为可变参数的本质就是数组），toArray方法
        //创建普通map集合
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("张三","南京");
        hashMap.put("李四","的我");
        hashMap.put("王五","南发错地方了京");
        hashMap.put("赵六","南v让她根本京");
        hashMap.put("钱七","不让他和");
        hashMap.put("i哦好的哦","会有人");
        hashMap.put("得到","回过头r");
        hashMap.put("润肤乳","固溶体");
        hashMap.put("非人防","很诡异挺好");
       /* //获取所有entry对象的集合
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        //toArray方法在底层会比较集合的长度和数组长度两者的大小
        //如果集合的长度大于数组的长度，说明数据在数组中放不下，此时会根据集合中entry对象的个数重新创建数组
        //如果集合的长度小于数组的长度，不会创建新的数组，会使用这个指定长度的数组，未占用的索引位置默认为null
        //所以括号里面entry数组长度写0就可以了
        //new Map.Entry[0]就是创建了一个长度时0的entry数组
        Map.Entry[] array = entries.toArray(new Map.Entry[0]);
        //不可变map集合，可变参数实际上就是数组，所以参数可以传递数组
        Map map1 = Map.ofEntries(array);
        System.out.println(map1);*/

        /*//简化写法：

        Map<Object, Object> map1 = Map.ofEntries(hashMap.entrySet().toArray(new Map.Entry[0]));
        System.out.println(map1);*/

        //JDK10之后的简化写法
        Map<String, String> map1 = Map.copyOf(hashMap);
        System.out.println(map1);


    }
}
