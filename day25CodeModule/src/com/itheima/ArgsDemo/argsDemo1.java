package com.itheima.ArgsDemo;

public class argsDemo1 {
    public static void main(String[] args) {
        //JDK5
        //可变多数
        //方法形参的个数是可以发生变化的，0 1 2 3...
        //格式:属性类型..名字
        //比如int...args
        //作用：在形参中接收多个参数

        //可变参数的细节：
        //1.在方法的形参中最多只能写一个可变参数
        //可变参数可以理解为一个大胖子，有多少吃多少

        //2.在方法当中，如果除了可变参数之外，还有其他形参，那么可变参数要写在最后面

        System.out.println(getSum(1, 2, 3, 4, 5, 6, 8));
    }

    //底层：
    //可变参数底层实际就是一个数组（可变参数在本质上就是一个数组）
    //只不过不需要我们自己创建，java会帮我们创建好
    public static int getSum(int... args) {
        //System.out.println(args);//数组的地址值
        int sum = 0;
        for (int arg : args) {
            sum+=arg;
        }
        return sum;
    }
}
