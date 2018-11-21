package cn.wust.demo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\a.txt");
        fos.write(97);

        byte[] bytes = {65, 66, 67, 68};

        fos.write(bytes, 1, 2);

        fos.write(bytes);

        fos.write("helloworld".getBytes());

        fos.close();
    }
}
