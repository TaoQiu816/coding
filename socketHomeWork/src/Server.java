import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

public class Server {
    //静态化列表，存储用户信息，并且可以在线程中修改（注册时）
    static ArrayList<Socket> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        //服务端
        //创建对象，绑定端口
        ServerSocket ss = new ServerSocket(10000);

        //获取本地文件中的用户信息
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("socketHomeWork/userInfo.txt");
        prop.load(fis);//////
        fis.close();

        //来一个客户端连接，就创建一个线程
        while (true){
            Socket socket = ss.accept();
            System.out.println("有客户端连接");
            //给线程传递连接对象与用户信息
            new Thread(new ServerThread(socket,prop)).start();

        }


    }
}
