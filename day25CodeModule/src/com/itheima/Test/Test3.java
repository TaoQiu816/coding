package com.itheima.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //自动点名器3
        //班级里有N个学生
        //要求:
        //被点到的学生不会再被点到。
        //但是如果班级中所有的学生都点完了，需要重新开启第二轮点名，

        //定义集合
        ArrayList<String> list1 = new ArrayList<>();
        //同时添加多个元素,调用collections中的addall方法
        Collections.addAll(list1, "张三", "李四", "王五", "赵六", "钱七", "范闲", "范建", "滕子京", "圆明园");
        //记录集合长度
        int size = list1.size();
        //纪录被删除的元素
        ArrayList<String> list2 = new ArrayList<>();
        Random r = new Random();


        //外循环表示进行多少轮次完整点名
        for (int i = 1; i <= 10; i++) {
            System.out.println("=================第" + i + "轮点名=====================");
            //内循环表示点名的具体操作
            //一轮完整的循环，不重复的抽取集合中的每一个元素
            for (int j = 0; j < size; j++) {
                //随机抽取
                //保证数据不重复，每点到一个人就remove一个数据

                int index = r.nextInt(list1.size());
                System.out.println(list1.get(index));
                //可根据索引或者对象本身删除元素
                //通过索引删除时，返回被删除的数据，可直接添加到list2
                //通过数据内容删除，返回Boolean
                list2.add(list1.remove(index));
            }
            //经过一轮完整的随机抽取后,list1为空，list2存储了所有数据
            //将数据存回list1，清空list2
            list1.addAll(list2);
            list2.clear();
            System.out.println(list1);
            System.out.println(list2);
        }

    }
}
