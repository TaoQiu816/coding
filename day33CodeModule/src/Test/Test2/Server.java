package Test.Test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //接收端

        //1.创建serversocket对象并绑定端口
        ServerSocket serverSocket = new ServerSocket(10086);

        //2.监听端口，等待客服端连接,若有连接则获取连接对象
        Socket socket = serverSocket.accept();

        //3.获取输入流并接收数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);//转换流防止乱码
        int b;
        //细节：此处read方法会从连接通道中读取数据
        //但是，read方法本身不知道什么时候数据终止，需要发送方法给一个结束标记，此处的数据接收循环才能停止
        //否则，程序就会一直停留在read方法这里，等待下面的数据继续输入
        while ((b=isr.read())!=-1){
            System.out.print((char) b);
        }

        //回写数据(写出数据时输出流)，从连接对象socket中获取输出流
        OutputStream outputStream = socket.getOutputStream();
        String str = "有多高兴？";
        outputStream.write(str.getBytes());

        //释放资源
        socket.close();
        serverSocket.close();

    }
}
