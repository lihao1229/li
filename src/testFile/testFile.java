package testFile;

import java.io.File;
import java.io.IOException;

public class testFile {
    public static void main(String[] args) {
        String separator = File.separator;
        String filename = "myfile.txt";
        String directory = "mydir1";

        File f = new File(directory,filename);
        if(f.exists()) {
            System.out.println("文件名：" + f.getAbsolutePath());
            System.out.println("文件大小：" + f.length());
        }else {
            f.getParentFile().mkdir();
            try {
                f.createNewFile();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
