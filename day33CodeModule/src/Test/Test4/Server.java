package Test.Test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {

        //创建对象，绑定端口
        ServerSocket serverSocket = new ServerSocket(10086);

        //不关闭服务器。并且使用循环，可实现客户端一直发送，服务器一直能接受
        //但是要结合多线程才能实现多个文件传输互相不干扰
        while (true) {
            //监听端口，等待连接
            Socket socket = serverSocket.accept();
            //一个用户对应服务端的一个线程

            //每来一个客户端的连接（也就是上传一个数据）
            //就建立一个线程，实现多个文件同时上传
            //启动对应线程
            new Thread(new myRunnable(socket)).start();


        }
        //serverSocket.close();//服务器关闭
    }
}
