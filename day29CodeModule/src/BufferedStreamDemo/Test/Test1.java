package BufferedStreamDemo.Test;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //四种方式拷贝文件，并统计各自用时
        //字节流的基本流:一次读写一个字节
        //字节流的基本流:一次读写一个字节数组
        //字节缓冲流:一次读写一个字节
        //字节缓冲流:一次读写一个字节数组

        //字节基本流，一次一个字节
        FileInputStream fis1 = new FileInputStream("day29CodeModule\\a.txt");
        FileOutputStream fos1 = new FileOutputStream("day29CodeModule\\a1.txt");
        //起始时间
        long start1 = System.currentTimeMillis();
        int b;//读取到的字节
        while ((b= fis1.read())!=-1){
            //写入到文件
            fos1.write(b);
        }
        long end1 = System.currentTimeMillis();
        //关流
        fis1.close();
        fos1.close();

        //字节流的基本流:一次读写一个字节数组
        FileInputStream fis2 = new FileInputStream("day29CodeModule\\a.txt");
        FileOutputStream fos2 = new FileOutputStream("day29CodeModule\\a2.txt");
        //起始时间
        long start2 = System.currentTimeMillis();
        byte[] bytes = new byte[1024];
        int len;
        while ((len=fis2.read(bytes))!=-1){
            fos2.write(bytes,0,len);
        }
        long end2 = System.currentTimeMillis();
        //关流
        fis2.close();
        fos2.close();

        //字节缓冲流:一次读写一个字节
        BufferedInputStream fis3 = new BufferedInputStream(new FileInputStream("day29CodeModule\\a.txt"));
        BufferedOutputStream fos3 = new BufferedOutputStream(new FileOutputStream("day29CodeModule\\a3.txt"));
        //起始时间
        long start3 = System.currentTimeMillis();
        int c;
        while ((c=fis3.read())!=-1){
            fos3.write(c);
        }
        long end3 = System.currentTimeMillis();
        //关流
        fis3.close();
        fos3.close();

        //字节缓冲流:一次读写一个字节数组
        BufferedInputStream fis4 = new BufferedInputStream(new FileInputStream("day29CodeModule\\a.txt"));
        BufferedOutputStream fos4 = new BufferedOutputStream(new FileOutputStream("day29CodeModule\\a4.txt"));
        //起始时间
        long start4 = System.currentTimeMillis();
        int len2;
        byte[] bytes2 = new byte[1024];
        while ((len2=fis4.read(bytes2))!=-1){
            fos4.write(bytes2,0,len2);
        }
        long end4 = System.currentTimeMillis();
        //关流
        fis3.close();
        fos3.close();

        System.out.println(end1 - start1);
        System.out.println(end2 - start2);
        System.out.println(end3 - start3);
        System.out.println(end4 - start4);

    }
}
