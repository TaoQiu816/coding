package day05_homework;

public class arrayHomework5 {
    public static void main(String[] args) {
        //定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。

        //定义数组
        int[] score = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};

        //求平均
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }

        double avg = sum*1.0/score.length;

        System.out.println("平均成绩" + avg);
    }
}
