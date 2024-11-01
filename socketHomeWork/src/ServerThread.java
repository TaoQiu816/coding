import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Properties;

//import static sun.security.jgss.GSSUtil.login;

public class ServerThread implements Runnable{
    Socket socket;
    Properties prop;

    public ServerThread(Socket socket,Properties prop) {
        this.socket = socket;
        this.prop=prop;
    }

    @Override
    public void run() {
        //判断用户进行哪种操作

        //获取输入流
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //只要不退出就可以一直获取用户的选择
            while (true){
                String choose = br.readLine();
                switch (choose){
                    case "login"->login(br);
                    case "register" ->register(br);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //注册
    private void register(BufferedReader br) {

    }

    //登陆
    private void login(BufferedReader br) throws IOException {
        //获取用户输入的信息
        System.out.println("用户选择登陆操作");
        String userInfo = br.readLine();
        //获取用户名与密码
        String usernameInput = userInfo.split("&")[0].split("=")[1];
        String passwordInput = userInfo.split("&")[1].split("=")[1];
        //验证用户信息
        if (prop.containsKey(usernameInput)){
            //用户名存在继续判断密码
            if (prop.get(usernameInput).equals(passwordInput)){
                //信息正确，返回1
                writeMessage2Client("1");
                //保存当前链接对象,用于服务器的消息转发接收
                Server.list.add(socket);
                //接收用户输入的消息，并转发给所有已连接的客户端
                talk2All(br,usernameInput);
            }else {
                //密码错误
                writeMessage2Client("2");
            }
        }else {
            //用户不存在
            writeMessage2Client("3");
        }
    }

    private void talk2All(BufferedReader br, String username) throws IOException {
        //接收用户输入，并发送给所有用户
        //死循环可以一直接收
        while (true){
            String str = br.readLine();

            //转发给所有已连接的客户端
            for (Socket s : Server.list) {
                writeMessage2Client(s,username+"发来消息："+str);
            }

        }
    }

    //这里的s不再指单独某一个链接对象，而是依次代表每一个链接对象
    private void writeMessage2Client(Socket s, String message) throws IOException {
        //获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }

    private void writeMessage2Client(String message) throws IOException {
        //向当前客户反馈验证信息
        //获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }
}
