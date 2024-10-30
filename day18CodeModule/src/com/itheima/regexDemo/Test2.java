package com.itheima.regexDemo;

public class Test2 {
    public static void main(String[] args) {
        //需求1：验证用户名是否满足要求
        //要求:大小写字母，数字，下划线一共4-16位
        //需求2：验证身份证号码是否满足要求。
        //简单要求:
        //    		18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
        //	复杂要求:
        //    		按照身份证号码的格式严格要求。

        //身份证号码:
        //            41080119930228457x
        //            510801197609022309
        //            15040119810705387X
        //            130133197204039024 I
        //            430102197606046442



        //用户名验证满足\\w
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));
        System.out.println("zhangsan@".matches(regex1));
        System.out.println("======================================");
        //身份证验证
        //简单要求
        //前17位任意数字 \\d{17}  最后一位为大写或小写x  [xX]
        String regex2 = "[1-9]\\d{16}(\\d|x|X)";
        //(\\d|x|X)还可以写为[\\dXx]  或者如下行所解释的(?i)x
        //忽略大小写的写法3：(?i)abc   这样会忽略(?i)后面所有字符的大小写，可用括号括起来限定忽略大小写的范围
        System.out.println("41080119930228457x".matches(regex2));
        System.out.println("510801197609022309".matches(regex2));
        System.out.println("15040119810705387X".matches(regex2));
        System.out.println("130133197204039024 I".matches(regex2));
        System.out.println("430102197606046442".matches(regex2));
        System.out.println("======================================");

        //复杂要求
        //前六位为地区信息：省份，市区，派出所等信息，第一位不能是0，后面5位是任意数字
           //[1-9]\\d{5}
        //中间八位为出生年月
             //年的前半段: 18 19 20
                 //两种情况取或 1[89]|20或者直接(18|19|20)
             //年的后半段: 任意数字出现两次  \\d{2}
             //月份: 01~ 09 10 11 12
                 //两种开头取或  0[1-9]]|1[0-2]
             //日期: 01~09 10~19 20~29 30 31
                 //取或 0[1-9]|[12]\\d|3[01]
        //最后四位表示性别  \\d{3}(\\d|x|X)
        //后面四位: 任意数字出现3次 最后一位可以是数字也可以是大写x或者小写x
        String regex3 = "[1-9]\\d{5}(1[89]|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}(\\d|(?i)x)";
        System.out.println("41080119930228457x".matches(regex3));
        System.out.println("510801197609022309".matches(regex3));
        System.out.println("15040119810705387X".matches(regex3));
        System.out.println("130133197204039024 I".matches(regex3));
        System.out.println("430102197606046442".matches(regex3));
    }
}
