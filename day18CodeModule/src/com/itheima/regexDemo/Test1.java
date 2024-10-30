package com.itheima.regexDemo;

public class Test1 {
    public static void main(String[] args) {
        //验证手机号码 13112345678 13712345667 13945679027 139456790271
        //
        //​	验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434
        //
        //​	验证邮箱号码 3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        //心得：拿着正确的数据，从左到右依次去写
        //根据手机号码的特点，第一位一定是1，第二位是3~9，剩余的都是整数0~9
        //因此分为三个部分
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1));//t
        System.out.println("13712345667".matches(regex1));//t
        System.out.println("13945679027".matches(regex1));//t
        System.out.println("139456790271".matches(regex1));//f
        System.out.println("------------------------------------");


        //座机号码验证
        //按照特征分为三个部分：区号、分隔符、号码
        //区号以0开始，从第二位开始是任意数字，出现2或3次  0\d{2,3}
        //分隔符：可以出现也可以不出现，也就是0或1次  -?
        //号码：首位不能是0，从第二位开始可以是任意数字，从第二位开始可以是任意数字，号码总长度规定为5-10位
        //[1-9]\d{4,9}  注意不是{5，10}因为第一位已经确定是0，剩余4到10位之间必须为\\d
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("02122442".matches(regex2));
        System.out.println("027-42424".matches(regex2));
        System.out.println("0712-3242434".matches(regex2));
        System.out.println("------------------------------------");

        //邮箱号分为三部分
        //用户名：可以是数字、字母、下划线即\\w，并且出现至少一次（也就是一次或者多次）\\w+
        //分隔符：@，只能出现一次
        //第三部分还要分成三个小部分
           //第一小部分：可以是数字或者字母以及组合但不能是下划线，如163，qq，即[\\w&&[^_]]{2,6}
           //第二小部分：.但是不能直接写，否则将会匹配为任意字符，要加上转义符,并且要写两次\\.
           //第三部分：大写字母小写字母都可以，只能出现2到3次[a-zA-Z]{2,3}
           //由于后面还可能再出现一个.cn等内容，形式与第三个小部分相同，因此可以让第二和三部分组合出现1或2次
           //  也就是(\\.[a-zA-Z]{2,3}){1,2}
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(regex3));
        System.out.println("zhangsan@itcast.cnn".matches(regex3));
        System.out.println("dlei0009@163.com".matches(regex3));
        System.out.println("dlei0009@pci.com.cn".matches(regex3));


        //使用插件any-rule  查需要的正则表达式，需要修改，比如转义符改为两个反斜线，起始和终止负号删除
       //24小时制正则表达式
        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        //小时位：可以0或1开头再加一位任意数，或者（用|符号）2开头加一位0到3的数字
        //分隔符为：
        //分钟位：00-59，也就是0到5开头加上一位任意数字
        //秒位：同分钟位
        System.out.println("22:23:59".matches(regex4));
        System.out.println("24:23:59".matches(regex4));

        //由于分钟位和秒位的桂则一样，因此可以对两者进行优化，只写一次，出现次数只能为2
        String regex5 = "([01]\\d|2[0-3])(:[0-5]\\d){2}";
        System.out.println("22:23:59".matches(regex5));
        System.out.println("24:23:59".matches(regex5));


    }
}
