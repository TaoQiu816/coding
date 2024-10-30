package com.itheima.ArraysDemo;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //arrays  操作数组的工具类，方法基本都是静态方法
        //常用方法
        //tostring(数组)把数组拼接成字符串
        //binarySearch(数组，查找的元素)，二分法查找元素
        //copyOf(原数组，新数组长度),拷贝数组
        //copyOfRange(原数组，起始索引，结束索引),拷贝数组（指定范围）
        //fill(数组，元素)，填充数组
        //sort(数组)，按照默认方式进行数组排序
        //sort(数组，排序规则)，按照指定的规则排序

        //tostring数组拼接成字符串
        System.out.println("--------------toString-------------------");
        int[] arr = {1,2,3,4,5,6,7,8,9};
        String s = Arrays.toString(arr);
        System.out.println(s);

        //binarySearch(数组，查找的元素)，二分法查找元
        //细节1：二分查找的前提：数组中的元素必须是有序的，而且必须是升序排列的
        //细节2：如果查找的元素存在，那么返回真实索引
        //但是，如果要查找的元素不存在，返回的是 -插入点索引-1
        //原因：加入要插入0，如果仅返回-插入点，那么就会出现问题，0不存在，-插入点为-0
        System.out.println("--------------binarySearch-------------------");
        System.out.println(Arrays.binarySearch(arr, 8));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 0));

        //copyOf(原数组，新数组长度),拷贝数组
        //拷贝后创建新数组，参数分别为老数组和新数组长度
        //根据第二个参数来创建新数组
        //如果长度小于原数组，会部分拷贝
        //等于原数组，完全拷贝
        //大于原数组，会补上默认初始值
        System.out.println("--------------copyOf-------------------");
        System.out.println(Arrays.toString(Arrays.copyOf(arr, 3)));
        System.out.println(Arrays.toString(Arrays.copyOf(arr, arr.length)));
        System.out.println(Arrays.toString(Arrays.copyOf(arr, arr.length+5)));


        //copyOfRange(原数组，起始索引，结束索引),拷贝数组（指定范围）
        //关于拷贝范围的索引：包头不包尾，包左不包右
        System.out.println("--------------copyOfRange-------------------");
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 3, 8)));//包含3索引不包含8索引


        //fill(数组，元素)，填充数组，原有元素被覆盖
        System.out.println("--------------fill-------------------");
        Arrays.fill(arr,236);
        System.out.println(Arrays.toString(arr));



        //sort(数组)，默认情况下，对基本数据类型进行升序排序,底层使用的是快速排序
        System.out.println("--------------sort-------------------");
        int[] arr1 = {9,8,6,5,4,2,3,1,7};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //sort(数组，排序规则)，按照指定的规则排序
        //第二个参数为一个接口,
        //细节：只能给引用数据类型的数组进行排序
        //如果数组是基本数据类型的，需要变成对应的包装类
        Integer[] arr2 = {9,8,6,5,4,2,3,1,7};

        //第二个参数为一个接口，需要传递这个接口的实现类对象，作为排序的规则
        //但是这个实现类只需要使用一次，所以就没有必要单独的去写一个类，可使用匿名内部类

        //底层原理：
        //利用插入排序+二分查找的方式进行排序
        //默认把0索引的数据当作是有序的序列，1索引到最后认为是无序的序列
        //遍历无序序列得到里面的每一个元素，假设当前遍历得到的元素是A元素
        //把A元素往有序序列中进行插入，在插入的时候，是利用二分查找确认A元素的插入点
        //拿着A元素跟插入点的元素进行比较，比较的规则就是compare方法的方法体
        //如果方法的返回值是负数，拿着A继续跟前面的数据进行比较
        //如果方法的返回值是0，拿着A继续跟后面的数据进行比较
        //知道能确定A的最终位置为止

        //compare方法的形式参数
        //参数一 o1 ： 表示在无序序列中遍历得到的每一个元素
        //参数二 o2 ： 有序序列中的元素

        //返回值
        //负数：表示当前插入的值是小的，放在前面
        //正数：表示当前插入的值是大的，放在后面
        //0：插入值与现在的元素相等，也放在后面

        //简单理解：
        //o1 - o2 :升序排列
        //o2 - o1 :降序排列
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("-------------------------------");
                System.out.println("o1:"+o1);
                System.out.println("o2:"+o2);
                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(arr2));


    }
}
