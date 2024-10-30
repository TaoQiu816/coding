package com.itheima.mathDemo1;

public class mathdemo3 {
    public static void main(String[] args) {
        //三位自幂数
        //三位数范围：100~999
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            //获取个十百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
        //四位、
        int count1 = 0;
        for (int i = 1000; i <= 9999; i++) {
            //获取个十百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4);
            if (sum == i) {
                System.out.println(i);
                count1++;
            }
        }
        System.out.println(count1);

        //五位、
        int count2 = 0;
        for (int i = 10000; i <= 99999; i++) {
            //获取个十百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            double sum = Math.pow(ge, 5) + Math.pow(shi, 5) + Math.pow(bai, 5) + Math.pow(qian, 5) + Math.pow(wan, 5);
            if (sum == i) {
                System.out.println(i);
                count2++;
            }
        }
        System.out.println(count2);
    }


}
