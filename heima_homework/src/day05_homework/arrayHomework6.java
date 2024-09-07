package day05_homework;

import java.util.Scanner;

public class arrayHomework6 {
    public static void main(String[] args) {
        //有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
        // 再通过键盘录入一个整数数字。要求：把数字放入数组序列中，生成一个新的数组，
        // 并且数组的元素依旧是从小到大排列的。执行效果如下：
        //请输入一个整数数字：
        //50
        //生成的新数组是：12 14 23 45 50 66 68 70 77 90 91
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        //动态定义新数组
        int[] newArr = new int[arr.length + 1];

        //键盘录入
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数数字：");
        int number = sc.nextInt();

        //标记新插入数字的索引
        int flag = 0;
        //加入新数字
        //若加入的数字比最小值都小，则加入数组开头
        if (arr[0] > number) {
            newArr[0] = number;
            flag = 0;
        } else if (arr[arr.length - 1] < number) {
            //若加入的数字比最大值都大，则加入数组末尾
            newArr[newArr.length - 1] = number;
            flag = newArr.length - 1;

        } else {
            //若加入的数字不是在起始位置，则找位置
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] <= number && arr[i] >= number) {
                    //从0索引的数字开始比，直到找到可插入的位置
                    //那么就在此数字之前插入新新数字，并且新数字的索引为i
                    newArr[i] = number;
                    flag = i;
                    //System.out.println(flag);
                    break;
                }
            }
        }


        //保留其他数字
        for (int i = 0; i < newArr.length; i++) {
            if (i < flag) {
                //在新加的数字之前原数据索引不变
                newArr[i] = arr[i];
            } else if (i > flag) {
                //在新加的数字之后，原数据索引值加一
                newArr[i] = arr[i - 1];
            }
            //System.out.print(arr[i] + " ");
            //System.out.print(newArr[i] + " ");
        }
        //验证
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
