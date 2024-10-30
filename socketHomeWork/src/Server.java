import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class Server {
    public static void main(String[] args) throws IOException {
        //服务端
        //map存放用户信息
        HashMap<String, String> map = new HashMap<>();
        //本地用户信息文件地址
        String path = "socketHomeWork\\userInfo";

        //读取本地用户信息
        readUserInfo(path, map);

        //绑定端口，监听用户连接
        ServerSocket serverSocket = new ServerSocket(10000);//对应客户端端口

        while (true) {
            //监听用户端连接，有一个链接就建立一个线程
            Socket socket = serverSocket.accept();
            System.out.println("有用户加入");
            new ServerThread(socket);
        }
    }

    private static void readUserInfo(String path, HashMap<String, String> map) throws IOException {
        //读取本地存储的用户信息
        File file = new File(path);
        //按行读取，并存进集合(双列集合，可去重)

        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        while ((s = br.readLine()) != null) {
            //键：用户名，值：密码
            map.put(s.split("&")[0].split("=")[1], s.split("&")[1].split("=")[1]);
        }
    }
}
