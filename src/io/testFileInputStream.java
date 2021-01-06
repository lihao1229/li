package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class testFileInputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;

        try {
            File f = new File("/Users/haoli/Downloads/test/src/io/testFileInputStream.java");
            in = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("未找到文件");
            System.exit(-1);
        }

        try {
            long num = 0;
            while ((b = in.read()) != -1) {
                System.out.println((char) b);
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("共读取了" + num + "个字节");
        } catch (IOException e1) {
            System.out.println("文件读取错误");
            System.exit(-1);
        }
    }
}

/*文件流读取
1.创建一个FileInputStream in；
2.调用in.read，读取每一个数据流，循环，若不是-1，则没结束，挨个输出，输出万记得调用in.close
3.io操作存在IOException风险
*/
