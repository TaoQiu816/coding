package BufferedStreamDemo;

import java.io.*;

public class BufferStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //字节缓冲流是对字节流的高级包装
        //字节缓冲流：底层会创建长度为8192的字符数组（缓冲区），读写操作实际上还是字节流来完成（基本流）
        //缓冲流的基本原理，是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数，从而提高读写的效率。
        //原因：内存访问硬盘（io次数）是主要的耗时
        //* `public BufferedInputStream(InputStream in)` ：创建一个 新的缓冲输入流。
        //* `public BufferedOutputStream(OutputStream out)`： 创建一个新的缓冲输出流。

        //使用字节缓冲流拷贝文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day29CodeModule\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day29CodeModule\\copy.txt"));

        //循环读取并写到目的地
        int b;//读取到的每个字节的数据，一次一个字节
        while ((b=bis.read())!=-1){
            bos.write(b);
        }

        //关闭缓冲流，底层会先把基本流关闭
        bis.close();
        bos.close();


    }
}
