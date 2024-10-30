package com.itheima.systemdemo;

public class systemdemo1 {
    public static void main(String[] args) {
        /*public static long currentTimeMillis()			// 获取当前时间所对应的毫秒值（当前时间为0时区所对应的时间即就是英国格林尼治天文台旧址所在位置）
        public static void exit(int status)				// 终止当前正在运行的Java虚拟机，0表示正常退出，非零表示异常退出
        public static native void arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length); // 进行数值元素copy*/

        //关于arraycopy的注意点
        //1.如果数据源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
        //2.再拷贝数组的时候需要考虑数组的长度，如果超出范围会报错
        //3.如果数据源数组和目的地数组都是引用数据类型，那么子类类型可以赋值给父类类型

        //终止当前运行的JAVA虚拟机
        //0表示正常终止,非0通常用1表示虚拟机异常停止
        //当需要把整个程序终止的时候可以调用此方法
        //System.exit(0);

        //返回当前系统时间的毫秒值形式
        //时间差可用于测试某段代码的运行时间，从而验证效率
        long l = System.currentTimeMillis();
        System.out.println(l);

        //拷贝数组
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        //参数一：数据源，要拷贝的数据从哪个数组里面来
        //参数二：起始索引，从数据源数组中的第几个索引开始拷贝
        //参数三：目的地，要把数据拷贝到哪个数组之中
        //参数四：目的地数组的索引，也就是目的数组的起始位置
        //参数五：拷贝数据的个数
        System.arraycopy(arr1, 6, arr2, 2, 3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }


    }
}
