package com.itheima.stringdemo;

public class stringDemo1 {
    public static void main(String[] args) {
        //1.使用直接赋值的方式获取一个字符串对象
        //此方法创建的字符串存储在串池中
        //当使用双引号直接赋值时，系统会检查该字符串在串池中是否存在
        //若不存在，则创建新的，并把地址赋值给字符串对象
        //若已存在，则复用，也就是把已存在的字符串地址赋值给字符串对对象
        String s1 = "abc";
        System.out.println(s1);

        //2.使用new的方式来获取一个字符串对象，不会复用，可能会比较费内存
        //每new一次都会产生一个新的小空间
        //空参构造，可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");


        //传递一个字符串，根据传递的字符串内容再创建一个新的字符串（脱裤子放屁）
        String s3 = new String("abc");
        System.out.println(s3);

        //传递一个字符数组，根据字符数组的内容创建一个新的字符串对象
        //应用场景：修改字符串内容，因为字符串本身不能更改，但可以通过更改字符数组来更改字符串
        char[] chs = {'a','b','c','d','e'};
        String s4 = new String(chs);
        System.out.println(s4);

        //传递一个字节数组，根据字节数组的内容创建一个新的字符串对象
        //应用场景：在网络中传输的数据都是字节信息
        //一半将字节信息进行转换，此时就要用到这个构造
        byte[] bytes = {97,98,99,100,101,102,103};
        String s5 = new String(bytes);
        System.out.println(s5);
    }

}
