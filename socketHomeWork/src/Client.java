import java.io.IOException;
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

    private static void login(Socket socket) {

    }
}
