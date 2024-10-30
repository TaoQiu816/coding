package Test.Test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //TCP通信练习2 ---接收和反馈
        //客户端:发送一条数据，接收服务端反馈的消息并打印
        //服务器:接收数据并打印，再给客户端反馈消息
        //正常发送与回写数据的方向是不同的

        //1.创建socket对象并连接服务器
        Socket socket = new Socket("127.0.0.1",10086);

        //2.写出数据
        String str ="见到你很高兴！";
        OutputStream os = socket.getOutputStream();//获取输出流用于写出数据
        os.write(str.getBytes());

        //数据发送完毕后，关闭输出流，作为发送数据终止的标记，让接收方的read方法停止接受，从而可以执行后续逻辑
        socket.shutdownOutput();

        //3.接受回写数据
        InputStream inputStream = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream);
        int b;
        while ((b= isr.read())!=-1){
            System.out.print((char) b);
        }

        //释放资源
        socket.close();
    }
}
