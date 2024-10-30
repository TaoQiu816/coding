package com.itheima.Test;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //打乱一维数组中的数据0~15，并以四个一组存入二维数组

        //定义一维数组
        int[] temp = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //打乱数组顺序，与随机索引数据进行交换
        Random r = new Random();
        for (int i = 0; i < temp.length; i++) {
            //随机索引

            int randomIndex = r.nextInt(16);

            //交换数据
            int x = temp[randomIndex];
            temp[randomIndex] = temp[i];
            temp[i] = x;
        }

        //存入二维数组
        int[][] newArr = new int[4][4];
        /*for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = temp[i*newArr.length + j];
            }
        }*/
        //法二:遍历一维数组
        for (int i = 0; i < temp.length; i++) {
            newArr[i / 4][i % 4] = temp[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.println(newArr[i][j]);
            }
        }
    }
}
