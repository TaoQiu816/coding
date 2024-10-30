package com.itheima.comprehensiveTest;

public class compreTest2 {
    public static void main(String[] args) {
        //​	判断101~200之间有多少个素数，并输出所有素数。
        //
        //备注：素数就是质数
        //计数变量
        int count =0;
        for (int i = 101; i <= 200; i++) {
            //判断是否是质数
            //辅助变量,统计循环中不能被整除的个数
            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i%j==0){//若有可被整除的则直接记为不是质数,直接终止当前循环
                    flag = false;
                    break;
                }
            }
            //若flag仍为true则为质数
            if (flag){
                count++;
                System.out.println(i);

            }
        }
        System.out.println(count + "个素数");
    }
}
