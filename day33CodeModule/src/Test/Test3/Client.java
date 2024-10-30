package Test.Test3;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //TCP通信练习3 ---上传文件
        //客户端:将本地文件上传到服务器。接收服务器的反馈。
        //服务器:接收客户端上传的文件，上传完毕之后给出反馈。

        //1.Socket对象创建，连接服务器
        Socket socket = new Socket("127.0.0.1",10086);

        //2.读取并写出数据
        //创建输入流，读取本地文件（缓冲流提高效率）
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day33CodeModule\\src\\Test\\Test3\\a.txt"));
        //获取输出流，写出数据
        //OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        /*int b;
        while ((b=bis.read())!=-1){
            bos.write(b);
        }*/
        //一次读取写入一个字节数组
        int len;
        byte[] bytes = new byte[1024];
        //len为实际读取的长度
        while ((len=bis.read(bytes))!=-1){
            //写出数据
            bos.write(bytes,0,len);

        }
        bos.flush();//数据量小，没有填满缓冲区，不刷新会滞留
        bis.close();
        //终止标签，表示写出数据完毕`


        socket.shutdownOutput();
        //关流
        //bis.close();


        /*//获取输入流，接受反馈
        InputStream back = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(back);
        //读取反馈信息
        int c;
        while ((c=isr.read())!=-1){
            System.out.println((char) c);
        }
        isr.close();*/

        //获取反馈(转换流，缓冲字符流)
        BufferedReader back = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = back.readLine();
        System.out.println(s);

        //释放资源
        socket.close();
    }
}
