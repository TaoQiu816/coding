package com.itheima.comprehensiveTest;

import java.util.Scanner;

public class compreTest6 {
    public static void main(String[] args) {
        //数字解密
        //加密过程：先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数
        //从而有解密过程：先获得每位数并反转顺序，由于加密过程中每位数+5最多只能为14，因此解密过程此步的逆步骤即分类讨论5至14，再每位-5

        //1.获取待解密数据
        System.out.println("请输入待解密数据");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numberTemp = number;//暂存number


        //2.获取每位数，反转，存于数组
        //2.1首先获得数组长度：从右往左依次去掉对应位上的数，直至位0，定义计数变量记录位数
        int count = 0;
        //int index=0;
        while (number!=0){
            number = number/10;
            count++;//作为数组长度
        }

        int[] numberArr = new int[count];
        int index = 0;
        //逆序存入数组
        while (numberTemp!=0){
            //从右向左取每位数字
            int x = numberTemp%10;
            numberArr[index] = x;
            index++;
            //更新numbertemp
            numberTemp = numberTemp/10;

        }
        //验证
        for (int i = 0; i < numberArr.length; i++) {
            System.out.print(numberArr[i] + " ");
        }

        //由于要+5再对10取余，则+5后范围为5到14，所以取余后为5到9，则取余前也为5到9，取余后0到4对应取余前10到14
        //循环得到取余前数字
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i]>=0 && numberArr[i]<=4){
                numberArr[i] = numberArr[i] + 10;
            }
        }
        //每位-5
        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i]-=5;
        }

        for (int i = 0; i < numberArr.length; i++) {
            System.out.print(numberArr[i] + " ");
        }

        //拼接输出
        int key = 0;
        for (int i = 0; i <= numberArr.length-1; i++) {
            key=key*10+numberArr[i];

        }

        System.out.println("解密后" + key);
    }
}
