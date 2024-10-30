package com.itheima.mystatic.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtill {
    //学生工具类，获取集合中最大的学生年龄

    //私有化构造方法
    private StudentUtill() {

    }

    //静态化工具方法
    public static int getMaxAge(ArrayList<Student> list) {
        //获取集合中最大学生的年龄
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if (max < tempAge) {
                max = tempAge;
            }
        }
        return max;
    }
}
