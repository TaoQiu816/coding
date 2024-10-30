package com.itheima.comprehensiveTest;

import java.util.Scanner;

public class compreTest5 {
    public static void main(String[] args) {
        //需求：
        //
        //​	某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
        //
        //规则如下：
        //
        //​	先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。
        //1.获取密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码");
        int key = sc.nextInt();
        //暂存key
        int keyTemp = key;
        //2.获取每一位，存于数组
        //2.1首先要获取数组的长度，也就是整数的位数
        //计数变量，统计位数
        int count = 0;

        while (key!=0){
            //依次从右往左去掉每一位数字
            key = key/10;
            count++;
        }
        //循环中重复会key进行赋值，到最后key=0，因此要在之前新添加变量暂存key
        //2.2定义数组
        int[] keyArr = new int[count];
        //2.3将数据的每一位存到数组之中
        //索引
        int index = keyArr.length-1;
        while (keyTemp!=0){
            //从右向左获取数字的每一位
            int x = keyTemp%10;
            //将获取的数字存于数组
            keyArr[index] = x;
            //更新索引
            index--;
            //更新temp下次使用
            keyTemp = keyTemp/10;

        }
        //验证
        for (int i = 0; i < keyArr.length; i++) {
            System.out.print(keyArr[i] + " ");
        }


        //int[] keyArr = {1, 9, 8, 3};
        //3.每位+5
        for (int i = 0; i < keyArr.length; i++) {
            keyArr[i] = keyArr[i] + 5;
        }
        //4.对10求余
        for (int i = 0; i < keyArr.length; i++) {
            keyArr[i] = keyArr[i] % 10;
        }
        //5.反转
        for (int i = 0, j = keyArr.length - 1; i < j; i++, j--) {
            int temp = keyArr[i];
            keyArr[i] = keyArr[j];
            keyArr[j] = temp;
        }
        //6.拼接并输出
        int number = 0;
        for (int i = 0; i < keyArr.length; i++) {
            number = number * 10 + keyArr[i];
        }
        System.out.println();
        System.out.println("加密后" + number);

    }
}
