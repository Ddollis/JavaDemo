package cn.wust.demo;


import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("c:\\a.txt");
            fos.write(100);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("文件写入失败，重试 ");
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                throw new RuntimeException("关闭资源失败");
            }
        }
    }
}
