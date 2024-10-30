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

        //需要循环

        while (true) {
            System.out.println("服务器已经连接成功");
            System.out.println("==============欢迎来到黑马聊天室================");
            System.out.println("1登录");
            System.out.println("2注册");
            System.out.println("请输入您的选择：");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice==1){
                //登录
                login(sc, socket);
    
            } else if (choice==2) {
                //注册
                register(sc, socket);
            }
        }
    }

    private static void register(Scanner sc, Socket socket) throws IOException {
        //获取输出流
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));//利用转换流
        //将用户名和密码整行写出:1.bufferedriter写出字符串再换行；2.printwriter的writeline方法
        getInputAndOut(sc, bw,"register");

        //接受信息：服务端的信息验证结果
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));//获取输入流
        String message = br.readLine();
        //根据验证结果输出
        if (message.equals("1")) {
            System.out.println("登陆成功");
            //开启一个线程，并开始聊天
            //对所有人说话（一直可以说话）
            allwaysTalk2All(sc, bw);
        } else if (message.equals("2")) {
            System.out.println("密码错误");
        } else if (message.equals("3")) {
            System.out.println("用户名不存在");
        }
    }

    private static void allwaysTalk2All(Scanner sc, BufferedWriter bw) throws IOException {
        while (true) {
            //可以一直说话
            System.out.println("请输入您想说的话");
            String str = sc.nextLine();
            //写出聊天的话到服务器
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
    }

    private static void getInputAndOut(Scanner sc, BufferedWriter bw,String choice) throws IOException {
        System.out.println("请输入用户名：");
        String usernameInput = sc.nextLine();
        System.out.println("请输入密码：");
        String passwordInput = sc.nextLine();
        //按照指定格式发送给服务端,整行写出（bufferedWriter）

        //写出登陆选项
        bw.write(choice);
        bw.newLine();
        bw.flush();

        //写出输入的信息
        StringBuilder sb = new StringBuilder();//字符串拼接
        sb.append("username=").append(usernameInput).append("&").append("password=").append(passwordInput);
        bw.write(sb.toString());
        bw.newLine();
        bw.flush();
        //br.close();//写出完毕，释放资源
    }

    private static void login(Scanner sc, Socket socket) throws IOException {
        //获取输出流
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));//利用转换流
        //将用户名和密码整行写出:1.bufferedriter写出字符串再换行；2.printwriter的writeline方法
        getInputAndOut(sc, bw,"login");

        //接受信息：服务端的信息验证结果
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));//获取输入流
        String message = br.readLine();
        //根据验证结果输出
        if (message.equals("1")){
            System.out.println("注册成功成功");
            //开启一个线程，并开始聊天
            //对所有人说话（一直可以说话）
            allwaysTalk2All(sc, bw);
        } else if (message.equals("2")) {
            System.out.println("用户名已存在");
        } else if (message.equals("3")) {
            System.out.println("用户名或密码格式错误");
        }
    }
}
