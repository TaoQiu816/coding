package day05_homework;

public class arrayHomework4 {
    public static void main(String[] args) {
        //现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，
        //从数组的最大索引位置开始到最小索引位置，依次表示整数的
        //个位、十位、百位。。。依次类推。请编写程序计算，这个数组
        // 所表示的整数值。例如：
        //数组：{2, 1, 3, 5, 4}
        //
        // 表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。
        //1.定义数组
        int[] arr = {1, 3, 5, 7, 9};
        //2.定义变量存储最终的整数
        int num = 0;
        //3.对数组进行遍历
        for (int i = 0; i < arr.length; i++) {
            //4.计算，高位乘以10再加上当前位的值
            num = num * 10 + arr[i];
        }
        //5.打印结果
        System.out.println(num);


    }


}
