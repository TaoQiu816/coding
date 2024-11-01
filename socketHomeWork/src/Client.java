import java.io.*;
import java.net.Socket;
import java.util.Scanner;



public class Client {
    public static void main(String[] args) throws IOException {
        //客户端
        //用户名和密码要求：
        //
        //要求1：用户名要唯一，长度：6~18位，纯字母，不能有数字或其他符号。"[a-zA-Z]{6,18}"
        //
        //要求2：密码长度3~8位。第一位必须是小写或者大小的字母，后面必须是纯数字。"[a-zA-Z]\\d{2,9}"


        //启动后首先建立连接，并提示登录
        Socket socket = new Socket("127.0.0.1",10000);//与服务器建立连接
        System.out.println("服务器已经成功连接");

        //界面循环
        while (true){
            System.out.println("===============================================");
            System.out.println("1.登陆");
            System.out.println("2.注册");
            System.out.println("请输入您的选择");
            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();
            //根据选项跳转
            switch (choose){
                case "1"-> login(socket);//登陆
                case "2"-> register(socket);//注册
                default -> System.out.println("输入错误");

            }
        }
    }

    private static void register(Socket socket) {

    }

    private static void login(Socket socket) throws IOException {
        //由连接对象获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//转换流转换为字符流
        //键盘录入信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入用户名");
        String password = sc.nextLine();

        //拼接用户名与密码
        StringBuilder sb = new StringBuilder();
        sb.append("username=").append(username).append("&password=").append(password);

        //第一次写出到服务器：表示登陆选项(一行)
        bw.write("login");
        bw.newLine();
        bw.flush();

        //第二次写出到服务器：用户名与密码
        bw.write(sb.toString());
        bw.newLine();
        bw.flush();

        //接收服务器的验证结果
        //获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = br.readLine();
        System.out.println(message);
        //根据服务器的验证结果执行后续操作
        //1.登陆成功，可以开始聊天。2.密码错误  3.用户名不存在
        if (message.equals("1")){
            //登陆成功
            System.out.println("登陆成功，开始聊天");
            //单独开启线程，用于持续接收服务端转发的聊天信息
            new Thread(new ClientThread(socket)).start();
            //开始聊天，向服务器写出输入的消息
            //传递已经获取的输出流，接收用户的输入
            talk2All(bw);
        } else if (message.equals("2")) {
            //密码错误
            System.out.println("密码输入错误");
        } else if (message.equals("3")) {
            System.out.println("用户名不存在");
        }

    }

    private static void talk2All(BufferedWriter bw) throws IOException {
        //用户输入
        Scanner sc = new Scanner(System.in);
        //只要开始聊天就可以一直输入，所以无限循环
        while (true){
            System.out.println("请输入您想说的话");
            String str = sc.nextLine();
            //写出到服务器
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
    }

}
