import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.HashMap;

public class ServerThread extends Thread{
    //传递连接对象
    Socket socket;
    //传递本地用户数据
    HashMap<String,String> map;

    public ServerThread(Socket socket,HashMap<String,String> map) {
        this.socket = socket;
        this.map=map;
    }

    @Override
    public void run() {
        //首先判断是登陆还是注册
        BufferedReader br;

        //获取输入流
        try {
             br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //读取用户选择：登录还是注册
            if (br.readLine().equals("login")) {
                //登录，验证用户信息

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
