package cn.wust.Demo2;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        getAllJava(new File("d:\\java"));
    }

    private static void getAllJava(File dir) {
        File[] fileArr = dir.listFiles(new MyJavaFilter());
        for (File f : fileArr) {
            if (f.isDirectory()) {
                getAllJava(f);
            } else {
                System.out.println(f);
            }
        }
    }

}
