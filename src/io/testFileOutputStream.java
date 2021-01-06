package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testFileOutputStream {
    public static void main(String[] args) throws IOException {
        int b = 0;
        FileInputStream in =null;
        FileOutputStream out = null;

        in = new FileInputStream("/Users/haoli/Downloads/test/src/io/testFileInputStream.java");
        out = new FileOutputStream("/Users/haoli/Downloads/copy.java");

        try {
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            in.close();
            out.close();
        }catch(FileNotFoundException e1) {
            System.out.println("文件未找到");
            System.exit(-1);
        }catch (IOException e1) {
            System.out.println("文件复制错误");
            System.exit(-1);
        }

        System.out.println("文件已复制");
    }
}
