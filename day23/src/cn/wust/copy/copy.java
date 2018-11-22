package cn.wust.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * d:\\a.txt
 * d:\\b.txt
 */
public class copy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("d:\\a.txt");
            fos = new FileOutputStream("d:\\b.txt");
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
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
