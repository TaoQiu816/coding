package Test.Test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //服务端，接收数据
        //TCP

        //1.创建socket对象并绑定端口（指定的端口）
        ServerSocket serverSocket = new ServerSocket(10000);

        //2.监听，等待客户端连接，若链接则获取连接socket对象
        Socket socket = serverSocket.accept();


        //3.读取数据
        //获取输入流读取数据(通过链接对象)
        //InputStream is = socket.getInputStream();
        //使用转换流转换为字符流，不会对中文乱码
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while ((b=isr.read())!=-1){
            System.out.print((char) b);
        }

        //释放资源
        socket.close();
        serverSocket.close();


    }
}
