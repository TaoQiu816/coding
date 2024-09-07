package com.itheima.methoddemo.Test;

public class Test1 {
    //逢7过：从任意一个数字开始报，当是包含7或者7的倍数时，说”过“
    //打印出1-100之间满足逢7必过 规则的数据
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            //i为7的倍数的情况，直接输出
            if (i%7==0){
                System.out.println(i);
            }else {
                //某一位包含7的情况
                //暂存i
                int temp = i;
                while (temp!=0){
                    //从右到左挨个取再判断
                    int x = temp%10;
                    //更新temp用于下一次取位,只要某一位为7则直接输出
                    temp=temp/10;
                    if (x==7){
                        System.out.println(i);
                        break;
                    }
                }
            }


        }

        //只考虑1-100时的简易版
        //if (i%10==7 || i/10%10==7 || i%7==0)
        //对应个位、十位为7或者本身为7的倍数
    }
}
