package Test.Test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //TCP
        ////客户端:多次发送数据
        ////服务器:按收多次接收数据，并打印

        //客户端，发送方
        //1.创建socket对象并连接服务器
        //指定服务器地址以及端口号
        Socket socket = new Socket("127.0.0.1",10000);

        //2.获取字节输出流用于写出数据（输出流获取一次即可）
        OutputStream os = socket.getOutputStream();
        //键盘多次录入数据直至输入886时终止
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("输入想传输的数据：");
            String str = sc.nextLine();
            //字节数组用于写入
            //判断是否是终止数据
            if (str.equals("886")){
                break;
            }
            //写出数据（字节数组）
            os.write(str.getBytes());
        }
        //3.释放资源
        socket.close();//对应的输出流会自动关闭

    }
}
