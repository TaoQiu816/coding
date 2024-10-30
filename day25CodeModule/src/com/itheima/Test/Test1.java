package com.itheima.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //班级里有N个学生，学生属性:姓名，年龄，性别。
        //实现机点名器。

        //定义集合
        ArrayList<String> list = new ArrayList<>();
        //同时添加多个元素,调用collections中的addall方法
        Collections.addAll(list,"张三","李四","王五","赵六","钱七","范闲","范建","滕子京","圆明园");
        //随机点名，collection实现类有索引
        Random r = new Random();
        int index = r.nextInt(list.size());
        System.out.println(list.get(index));

        //方法2：
        //打乱collection集合中的数据顺序，再直接获取第一个索引的数据
        Collections.shuffle(list);
        System.out.println(list.get(0));


    }
}
