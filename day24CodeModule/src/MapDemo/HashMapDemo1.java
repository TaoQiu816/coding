package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapDemo1 {
    public static void main(String[] args) {
        //HashMap的特点
        //① HashMap是Map里面的一个实现类。
        //② 没有额外需要学习的特有方法，直接使用Map里面的方法就可以了。
        //③ 特点都是由键决定的: 无序、不重复、无索引
        //④ HashMap跟Hashset底层原理是一模一样的，都是哈希表结构
        //哈希表结构：JDK8以前是数组+链表，之后是数组+链表+红黑树，长度超过8&数组长度>=64，自动转成红黑树

        //2.依赖hashCode方法和equals方法保证键的唯一（哈希值的计算只依赖键）
        //3.如果键存储的是自定义对象，需要重写hashcode和equals方法
        //如果值存储自定义对象，不需要重写hashcode和equals方法
        //注意上述对于键的限定

        //存储学生对象并遍历
        //需求
        //创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
        //存储三个键值对元素，并遍历
        //要求:同姓名，同年龄认为是同一个学生

        //创建集合
        HashMap<Student,String> map = new HashMap<>();
        //创建学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",22);
        Student s3 = new Student("wangwu",24);

        Student s4 = new Student("zhangsan",23);

        //添加到集合中,键为学生，值位籍贯
        map.put(s1,"陕西");
        map.put(s2,"四川");
        map.put(s3,"云南");

        //键不能重复，此时添加s4会将s1的值覆盖
        map.put(s4,"新疆");

        System.out.println(map);

        /*//遍历1：键找值
        Set<Student> keys = map.keySet();
        for (Student key : keys) {
            //获取值
            String value = map.get(key);
            System.out.println(key+","+value);
        }*/

        /*//遍历2：获取键值对
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+","+entry.getValue());
        }*/

        //遍历3：LAMBDA
        map.forEach(( key,  value)->  System.out.println(key+","+value));


    }
}
