package cn.wust.demo1;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\a.txt");
        int i=fis.read();
        System.out.println(i);
        fis.close();
    }

}
