package com.itheima.collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class collectionsDemo1 {
    public static void main(String[] args) {
        //java.util.Collections:是集合工具类
        //作用:Collections不是集合，而是集合的工具类。

        //常用API
        // public static <T> boolean addAll(Collection<T> c，T...elements) 批量添加元素,参数只能传递单列集合collection
        // public static void shuffle(List<?> list) 打乱List集合元素的顺序
        // public static<T> void sort(List<T> list) 排序
        // public static<T>void sort(List<T>list，Comparator<T>) 根据指定的规则进行排序
        // public staticT> int binarysearch(List<T>list, T key) 以二分查找法查找元素
        // public static<T> void copy(List<T> dest,List<T> src) 拷贝集合中的元素
        // public static<T>int fill(List<T>list, T obj) 使用指定的元素填充集合
        // public static<T>void max/min(Collection<T> coll) 根据默认的自然排序获取最大/小值
        // public static<T>void swap(List<?>list,int i,int j) 交换集合中指定位置的元素


        //(单列)集合元素的批量添加
        ArrayList<String> list1 = new ArrayList<>();
           //批量添加,要使用collections中的方法，而不是collection中的，两者有区别
        Collections.addAll(list1,"aaa","bbb","ccc","ddd","12365","54dhg","ouwcd5687");
        System.out.println(list1);

        //打乱list集合中元素的顺序（只能传递list集合）
        Collections.shuffle(list1);
        System.out.println(list1);

        //按照默认顺序进行排序
        Collections.sort(list1);
        System.out.println(list1);

        /*//按照指定顺序进行排序，实现comparator接口
        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;//自定义
            }
        });*/

        //拷贝集合元素
        //方法要求目标集合（dest）必须有足够的容量来接收源集合（src）中的元素。如果目标集合 list2 的容量不够大，会抛出 IndexOutOfBoundsException 异常。
        //在 list2 中预先填充与 list1 等量的空字符串或占位符
        ArrayList<String> list2 = new ArrayList<>(Collections.nCopies(list1.size(), ""));
        //Collections.addAll(list2,"aaa");

        Collections.copy(list2,list1);//拷贝后覆盖原有的元素
        System.out.println(list1);

        //填充集合
        Collections.fill(list1,"burwic");
        System.out.println(list1);

        //按照默认自然排序规则获取最值
        System.out.println(Collections.max(list2));
        System.out.println(Collections.min(list2));

        //交换几何中指定元素的位置
        System.out.println(list2);
        Collections.swap(list2,1,5);
        System.out.println(list2);


    }
}
