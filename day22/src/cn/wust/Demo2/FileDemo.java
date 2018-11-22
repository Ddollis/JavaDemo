package cn.wust.Demo2;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("d:\\java");
        getAllDir(dir);
    }

    private static void getAllDir(File dir) {
        System.out.println(dir);
        File[] fileArr = dir.listFiles();
        for (File f : fileArr) {
            if (f.isDirectory()) {
                getAllDir(f);
            } else {
                System.out.println(f);
            }
        }

    }
}
