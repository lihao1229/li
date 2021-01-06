package Socket;

import java.io.IOException;
import java.io.*;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 6666); //向6666端口发送请求
        OutputStream op = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(op);
        dos.writeUTF("test.txt");

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        System.out.println("文件接收成功");






    }
}
