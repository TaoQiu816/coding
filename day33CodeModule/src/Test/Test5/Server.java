package Test.Test5;

import Test.Test4.myRunnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        //频繁创建线程很浪费资源，因此要用线程池进行优化
        //c创建线程池随想
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//核心线程数量
                16,//最大线程数量（根据自己电脑的线程数量进行计算）
                60,//空闲时间（值）非核心线程经过就就要进行处理
                TimeUnit.SECONDS,//空闲时间（单位）
                new ArrayBlockingQueue<>(2),//阻塞队列
                Executors.defaultThreadFactory(),//线程工厂，让线程池如何创建线程对象（使用默认方法）
                new ThreadPoolExecutor.AbortPolicy()//线程拒绝策略，抛弃（经过空闲时间后）
        );

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
            //new Thread(new myRunnable(socket)).start();
            pool.submit(new myRunnable(socket));


        }
        //serverSocket.close();//服务器关闭
    }
}
