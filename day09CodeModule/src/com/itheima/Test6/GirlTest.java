package com.itheima.Test6;

import java.util.Scanner;

public class GirlTest {
    public static void main(String[] args) {
        //存储四个对象的数组，
        //计算出四个女孩的平均年龄
        //统计比平均年龄小的有几个，并打印其所有信息
        Girl[] G = new Girl[4];

        //键盘录入信息
        //输入对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < G.length; i++) {
            //定义对象
            Girl gf = new Girl();

            //姓名
            System.out.println("请输入姓名");
            String name = sc.next();
            gf.setName(name);
            //年龄
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            gf.setAge(age);
            //性别
            System.out.println("请输入性别");
            String gender = sc.next();
            gf.setGender(gender);
            //爱好
            System.out.println("请输入爱好");
            String hobby = sc.next();
            gf.setHobby(hobby);

            //对象存储到数组中
            G[i] = gf;
        }

        //年龄求和
        int sumAge = 0;
        for (int i = 0; i < G.length; i++) {
            sumAge = sumAge + G[i].getAge();
        }
        //平均年龄
        double avgAge = sumAge*1.0/G.length;
        System.out.println("平均年龄" + avgAge);

        //统计年龄情况
        int count = 0;
        for (int i = 0; i < G.length; i++) {
            if (G[i].getAge()<avgAge){
                count++;
                G[i].showInfo();
            }
        }
    }
}
