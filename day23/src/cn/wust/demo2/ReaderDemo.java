package cn.wust.demo2;

import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d:\\a.txt");
        /*int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char)len);
        }*/
        char[] ch = new char[1024];
        int len = 0;
        while ((len = fr.read(ch)) != -1) {
            System.out.print(new String(ch,0,len));
        }
        fr.close();
    }
}
