package day06_homework;

import java.util.Random;

public class methodHomework4 {
    public static void main(String[] args) {
        //奖金数组
        int[] arr = {2,588,888,1000,10000};
        //已被抽过的奖金
        int[] brr=new  int[arr.length];
        //统计索引值，用于统计已被抽奖的个数，以及判断是否终止抽奖
        int index = 0;
        //未抽完时继续抽奖
        while (index < arr.length){
            //随机索引实现随机抽奖
            Random r = new Random();
            //生成随机索引
            int i = r.nextInt(arr.length);
            //如果该索引对应的奖金未被抽到过，则抽取该奖金
            if (!check(arr[i],brr )){
                //将此次抽取的奖金存入已抽取数组
                brr[index] = arr[i];
                //统计索引+1，用于在brr存储下一奖金
                index++;
                //输出此次被抽取的奖金
                System.out.println(arr[i] + "奖金被抽取");
            }
        }
    }

    //判断数组中是否存在某数字
    public static boolean check(int value, int[] brr){
        for (int i = 0; i < brr.length; i++) {
            if (brr[i]==value){
                return true;
            }
        }
        //若没有则返回false
        return false;
    }
}
