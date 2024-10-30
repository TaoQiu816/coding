package com.itheima.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo6 {
    public static void main(String[] args) {
        //增强for遍历
       // 增强for的底层就是迭代器，为了简化迭代器的代码书写的，
        //所有的单列集合和数组才能用增强for进行遍历。

        //格式：
        // for(元素的数据类型 变量名:数组或者集合){
        //       }
        //若要使用遍历到的元素，直接使用括号内的变量名

        //创建集合添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        coll.add("zhaoliu");

        //增强for遍历
        //注意：
        //s其实就是一个第三方变量，在循环的过程中依次记录集合中的每一个数据
        /*for (String s : coll){
            System.out.println(s);
        }*/
       //快捷键：集合名.for
        for (String s : coll) {
            s = "qqq";
            //System.out.println(s);
        }
        System.out.println(coll);
        //细节:
        //修改增强for中的变量，不会改变集合中原本的数据。
        //因为增强for中的变量仅仅是一个第三方变量，只暂时记录集合中的数据
        //与集合没有任何关系（获取集合元素后赋值给这个第三方变量）

    }
}
