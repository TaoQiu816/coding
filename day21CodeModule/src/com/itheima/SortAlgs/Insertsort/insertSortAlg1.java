package com.itheima.SortAlgs.Insertsort;

public class insertSortAlg1 {
    public static void main(String[] args) {
        /*
            插入排序：
                将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
                遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
                N的范围：0~最大索引

        */
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        //1.首先要找到无序数据和有序数据，确定无序数据从哪一个索引开始
        //记录索引，初始值为不存在的索引
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            //有序要求：递增
            //因此无序的起始就是不满足数据的递增
            if (arr[i] > arr[i + 1]) {
                //前一个数字大于后一个 不满足递增

                startIndex = i + 1;//这里要加1

                break;
            }
        }

        //遍历无序数据，依次按要求插入有序数据
        //外层循环表示把无序数据依次插入变成有序
        for (int i = startIndex; i < arr.length; i++) {

            //内层循环表示每个无序数据的插入过程
            //交换过程：
            //索引i的数据依次跟其左边的数据进行比较直到索引为0比较结束（因为每插值一次，有序数据就增加一个）
            //如果该索引对应的数据比前一个数据小，则交换位置换到左边

            //记录当前要插入的数据的索引
            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {
                //交换数据
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                //更新该数据索引（因为向左交换了
                j--;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
