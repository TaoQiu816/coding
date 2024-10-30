package com.itheima.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //自动点名器2
        //班级里有N个学生
        //要求:
        //70%的概率随机到男生
        //30%的概率随机到女生

        //可创建集合存储0和1，比例按照概率来，比如7个和3个
        //抽到1，表示抽男生，再到男生中随机，抽到0再到女生中随机

        //创建集合，作为概率空间使用
        ArrayList<Integer> list = new ArrayList<>();
        //添加七个1和三个0
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        //打乱集合内容
        Collections.shuffle(list);
        //随机抽取0和1
        Random r = new Random();
        int i = r.nextInt(list.size());
        System.out.println(list.get(i));

        //创建两个集合分别存储男生和女生
        ArrayList<String> listBoy = new ArrayList<>();
        ArrayList<String> listGirl = new ArrayList<>();

        //添加数据
        Collections.addAll(listBoy,"范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰");
        Collections.addAll(listGirl,"杜琦燕","袁明媛","李猜","田蜜蜜");

        //抽到1则随机选男生
        if (i==1){
            int index = r.nextInt(listBoy.size());
            System.out.println(listBoy.get(index));
        }else {
            int index = r.nextInt(listGirl.size());
            System.out.println(listGirl.get(index));
        }

    }
}
