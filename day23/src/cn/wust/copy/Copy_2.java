package cn.wust.copy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_2 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("d:\\a.txt");
            fw = new FileWriter("d:\\b.txt");
            char[] cbuf = new char[1024];
            int len = 0;
            while ((len = fr.read(cbuf)) != -1) {
                fw.write(cbuf, 0, len);
                fw.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex);
            throw new RuntimeException("复制失败");
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                throw new RuntimeException("释放资源失败");
            } finally {
                try {
                    if (fr != null)
                        fr.close();
                } catch (IOException ex) {
                    throw new RuntimeException("释放资源失败");
                }
            }
        }
    }
}
