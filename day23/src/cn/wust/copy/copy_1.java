package cn.wust.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy_1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("d:\\a.txt");
            fos = new FileOutputStream("d:\\a.txt");
            byte[] bytes = new byte[1024 * 10];
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException ex) {
            System.out.println(ex);
            throw new RuntimeException("文件复制失败");
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException ex) {
                throw new RuntimeException("释放资源失败");
            } finally {
                try {
                    if (fis != null)
                        fis.close();
                } catch (IOException ex) {
                    throw new RuntimeException("释放资源失败");

                }
            }

        }
    }
}
