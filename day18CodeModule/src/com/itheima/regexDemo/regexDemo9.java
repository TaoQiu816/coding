package com.itheima.regexDemo;

public class regexDemo9 {
    public static void main(String[] args) {
        /*public String[] split(String regex)
//参数regex表示正则表达式。可以将当前字符串中匹配regex正则表达式的符号作为"分隔符"来切割字符串。

        public String replaceAll(String regex,String newStr)
//参数regex表示一个正则表达式。可以将当前字符串中匹配regex正则表达式的字符串替换为newStr。*/

        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        //细节:
        //方法在底层跟之前一样也会创建文本解析器的对象
        //然后从头开始去读取字符串中的内容，只要有满足的，那么就切割
        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //&&只能在字符类中使用，也就是只能在中括号中使用，不能在分组中使用，也就是圆括号
       //字母或者数字至少出现一次
        String s1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        String s2 = s.replaceAll("(\\w&&[^_])+", "vs");
        System.out.println(s1);
        System.out.println(s2);
    }
}
