package Test.Test4;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class myRunnable implements Runnable{
    Socket socket;
    //接受监听到的连接
    public myRunnable(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        try {
            //获取输入流，读取数据
            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            //创建输出流，将数据写入到本地文件
            //使用UUID获取随机名字，并且不重复（要通过UUID的静态方法获取随即名字）
            //去掉中间的短横线间隔符
            String randomUUID = UUID.randomUUID().toString().replace("-", "");
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day33CodeModule\\src\\Test\\Test4\\"+randomUUID+".txt"));

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

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //最终一定会执行
            //释放资源
            if (socket!=null){
                //非空判断原因：原因主要是为了避免在尝试关闭一个未初始化或已经被关闭的 socket
                // 时引发 NullPointerException 或 IOException
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
