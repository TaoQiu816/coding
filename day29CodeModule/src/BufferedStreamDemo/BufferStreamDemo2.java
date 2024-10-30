package BufferedStreamDemo;

import java.io.*;

public class BufferStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //字节缓冲流是对字节流的高级包装
        //字节缓冲流：底层会创建长度为8192的字符数组（缓冲区），读写操作实际上还是字节流来完成（基本流）
        //缓冲流的基本原理，是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数，从而提高读写的效率。
        //原因：内存访问硬盘（io次数）是主要的耗时
        //* `public BufferedInputStream(InputStream in)` ：创建一个 新的缓冲输入流。
        //* `public BufferedOutputStream(OutputStream out)`： 创建一个新的缓冲输出流。

        //使用字节缓冲流拷贝文件
        //缓冲输入和输出流各自有一个缓冲区，这两个缓冲区是不同的
        //记录读取数据的变量b或者字节数组是再两个缓冲区中进行读写操作（内存中进行的操作速度很快）
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day29CodeModule\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day29CodeModule\\copy2.txt"));

        //循环读取并写到目的地
        //一次读写多个字节
        //定义Byte数组
        byte[] bytes = new byte[1024];//读取到的数据
        int len;//实际读取到的长度
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        //关闭缓冲流，底层会先把基本流关闭
        bis.close();
        bos.close();


    }
}
