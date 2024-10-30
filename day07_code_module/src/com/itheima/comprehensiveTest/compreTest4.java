package com.itheima.comprehensiveTest;

import java.util.Scanner;

public class compreTest4 {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        // 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        //1.评委打分，键盘录入，存于数组之中
        int[] scoreArr = getScoreArr();

        //2.获取最高分
        int max = getMax(scoreArr);


        //3.获取最低分
        int min = getMin(scoreArr);

        //求和求平均
        int sum = getSum(scoreArr, min, max);
        double avg = sum *1.0/(scoreArr.length-2);
        System.out.println(avg);
    }

    public static int getSum(int[] scoreArr, int min, int max) {
        int sum=0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum+= scoreArr[i];
        }
        sum=sum- min - max;
        return sum;
    }

    public static int[] getScoreArr() {
        int[] scoreArr = new int[6];

        //键盘录入分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scoreArr.length; ) {
            System.out.println("请输入第" + (i+1)+"位评委的分数");
            int score = sc.nextInt();
            if (score>=0 && score<=100){
                //只有分数合法才存储,并且进入下次循环
                scoreArr[i] = score;
                i++;
            }else {
                System.out.println("成绩超出范围，请重新录入第" + (i+1)+"位评委的分数");
            }

        }
        return scoreArr;
    }

    public static int getMax(int[] arr) {
        //存贮最大值,默认为数组中的某一个数
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
    public static int getMin(int[] arr) {
        //存贮最大值,默认为数组中的某一个数
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
