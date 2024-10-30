package CharSet;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class charSwtDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //每个中文汉字占用两个字节
        //高位字节一定以1开头，用于区分英文ASCII以0开头


        //1.在计算机中，任意数据都是以二进制的形式来存储的
        //2.计算机中最小的存储单元是一个字节
        //3.ASCII字符集中，一个英文占一个字节
        //4.简体中文版Windows，默认使用GBK字符集
        //5.GBK字符集完全兼容ASCII字符集
            //一个英文占一个字节，二进制第一位是0
            //一个中文占两个字节，二进制高位字节的第一位是1

        //UTF-8编码规则是Unicode字符集的一个编码规则，ASCII一个字节并且字节首位为0，汉字三个字节并且中文第一个字节的首位一定是1

        //乱码原因1：读取数据时未完整读取整个汉字（比如字节流一次只读取一个字节）
        //乱码原因2：编码和解码的方式不统一

        //如何不产生乱码?
        //1，不要用字节流读取文本文件
        //2，编码解码时使用同一个码表，同一个编码方式

        //Java中编码的方法
            //public byte[] getBytes()使用默认方式进行编码(Unicode  UTF-8)
            //public byte[]getBytes(string charsetName)使用指定方式进行编码

        //Jawa中解码的方法
        //string(byte[] bytes)使用默认方式进行解码
        //String(byte[]bytes, string charsetName)使用指定方式进行解码

        //编码
        String s = "还好和地位u";
        byte[] bytes = s.getBytes();//16个字节,默认方式
        System.out.println(Arrays.toString(bytes));

        byte[] bytes1 = s.getBytes("GBK");//GBK中一个中文两个字节
        System.out.println(Arrays.toString(bytes1));//11字节

        //解码
        String str1 = new String(bytes);//默认方式
        System.out.println(str1);

        String str2 = new String(bytes1,"GBK");
        System.out.println(str2);
    }
}
