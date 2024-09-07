package day05_homework;

public class arrayHomework7 {
    public static void main(String[] args) {
        //定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
        //定义原数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //定义一个新数组。把原数组的奇数放在新数组的左边，把原数组的偶数放在新数组的右边
        int[] newArr = new int[arr.length];
        //计数变量，统计以获得的偶数个数，从而获得新索引
        int oCount = 0;

        //遍历判断奇偶，放入新数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                //若为偶数，则放进新数组右侧
                oCount++;
                newArr[newArr.length - oCount] = arr[i];
            } else {
                //若为奇数，则放在左侧
                newArr[i - oCount] = arr[i];
            }


        }
        //验证
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

        //方法二：不定义新数组，找到左边的偶数，和右边的奇数互换位置
    }
}
