package Test.Test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {

        //创建对象，绑定端口
        ServerSocket serverSocket = new ServerSocket(10086);

        //监听端口，等待连接
        Socket socket = serverSocket.accept();

        //获取输入流，读取数据
        InputStream is = socket.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        //创建输出流，将数据写入到本地文件
        //使用UUID获取随机名字，并且不重复（要通过UUID的静态方法获取随即名字）
        //去掉中间的短横线间隔符
        String randomUUID = UUID.randomUUID().toString().replace("-", "");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day33CodeModule\\src\\Test\\Test3\\"+randomUUID+".txt"));

        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);

        }
        bos.flush();//数据量小
        bos.close();
        //bis.close();

        /*//反馈信息
        OutputStream back = socket.getOutputStream();
        String str = "数据传输完毕";
        back.write(str.getBytes());*/

        //反馈BufferedWriter一次可以写一行
        BufferedWriter back = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        back.write("上传成功");
        back.newLine();
        back.flush();//将缓冲区剩余的数据直接输出
        //释放资源
        socket.close();
        serverSocket.close();
    }
}
