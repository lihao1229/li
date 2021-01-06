/*
1.客户端向服务器发送一个文件名test.txt,服务器检查当前目录，如果有这个文件，就发送给客户端，
如果不存在，服务器返回不存在的错误信息给客户端。

2.客户端在成功接收到文件后需要自动向服务器发送一个确认（自己定义）。

3.服务器设置超时重传机制，服务器在发送完文件3秒内没有收到客户端的确认，或者确认的内容与
规定不符，重新发送文件（一次即可）
 */
package Socket;

import java.io.DataInputStream;
import java.io.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666); //在6666端口监听
       // try {

                Socket s1 = ss.accept();
                DataInputStream dis = new DataInputStream(s1.getInputStream());
                System.out.println("连接已建立");
                System.out.println("客户端请求的文件是：");
                String filename = dis.readUTF();
                System.out.println(filename);

       // }catch(IOException ex) {
      //      System.out.println("Can not get connection.");
        // }

        File f = new File("Socket", "filename");
        if(f.exists()){
        FileOutputStream fos = new FileOutputStream(f);
        }



    }
}
