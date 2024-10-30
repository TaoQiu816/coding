package com.itheima.stringBuilder;

public class stringBuilderDemo1 {
    public static void main(String[] args) {
        //stringbuilder
        //创建对象
        StringBuilder sb = new StringBuilder();

        //添加元素，可以是任何类型
        sb.append(10);
        sb.append(2.25);
        sb.append("abcd");
        System.out.println(sb);
        //普及：
        //因为StringBuilder是Java已经写好的类
        //java在底层对他做了一些特殊处理。
        //打印对象不是地址值而是属性值。

        //反转
        sb.reverse();
        System.out.println(sb);

        //获取长度

        System.out.println(sb.length());

        //转换为字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
