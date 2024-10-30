package com.itheima.regexDemo;

public class regexDemo10 {
    public static void main(String[] args) {
        //捕获分组：分组之后还需要再用分组的数据
        //分组号按左括号为基准排序，序号连续不重复
        //后续还要使用分组中的数据时：  正则内部使用  \\组号
                                     //正则外部使用  $组号


        //需求1:判断一个字符串的开始字符和结束字符是否一致?只考虑一个字符
        //举例: a123a b456b 17891 &abc& a123b(false)
        //特征：起始字符和终止字符可任意，只要是一样的就行，中间的字符也任意，出现一次或者多次，用+即可
        // \\组号:表示把第X组的内容再出来用一次
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));//t
        System.out.println("b456b".matches(regex1));//t
        System.out.println("17891".matches(regex1));//t
        System.out.println("&abc&".matches(regex1));//t
        System.out.println("a123b".matches(regex1));//f
        System.out.println("===========================================");


        //需求2:判断一个字符串的开始部分和结束部分是否一致?可以有多个字符  所以用加号(出现一次或多次)
        //举例: abc123abc b456b 123789123 &!@abc&!@ abc123abd(false)
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));//t
        System.out.println("b456b".matches(regex2));//t
        System.out.println("123789123".matches(regex2));//t
        System.out.println("&!@abc&!@".matches(regex2));//t
        System.out.println("abc123abd".matches(regex2));//f
        System.out.println("===========================================");


        //需求3:判断一个字符串的开始部分和结束部分是否一致?开始部分内部每个字符也需要一致
        //举例: aaa123aaa bbb456bbb 111789111 &&abc&&
        //  *  表示出现0次或多次

        //(.) 表示把首字母看作一组
        // \\2  表示把首字母的分组拿出来再次使用（第二个左括号所以序号是2）
        //   *  作用于\\2，表示后面重复的内容出现0次或者多次
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&".matches(regex3));
        System.out.println("&2abc&2".matches(regex3));

    }
}
