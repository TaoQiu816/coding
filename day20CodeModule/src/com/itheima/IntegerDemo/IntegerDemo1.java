package com.itheima.IntegerDemo;

public class IntegerDemo1 {
    public static void main(String[] args) {

        //包装类：基本数据类型对应的对象

        //两种方法的底层原理和区别
        //使用NEW方法，每使用new一次，都会创建一个新的对象，因此对象存储的地址值都不同
        //使用valueof静态方法时：
        //由于在实际开发中，-128~127之间的数据用的比较多，若每次都重新创建对象会很费内存
        //因此java把这个范围内的每一个数据都创建好对象并存放于数组之中
        //要用时不会创建新的对象，而是使用已经创建好的对象

        //1.通过构造方法获取对象（过时了，了解即可）JDK5以前的方法
        Integer i1 = new Integer(1); //传递整数int
        System.out.println(i1);
        Integer i2 = new Integer("1");  //传递字符串表示的整数
        System.out.println(i2);


        //2.通过静态方法获取对象（（过时了，了解即可）JDK5以前的方法）
        //public static Integer valueOf(int i)：返回表示指定的 int 值的 Integer 实例
        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);

//public static Integer valueOf(String s)：返回保存指定String值的Integer对象
        Integer i4 = Integer.valueOf("100");
        System.out.println(i4);

        //指定进制
        Integer i5 = Integer.valueOf("100",2);
        System.out.println(i5);

    }
}
