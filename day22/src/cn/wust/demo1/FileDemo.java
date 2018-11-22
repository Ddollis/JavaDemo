package cn.wust.demo1;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        function_1();
    }

    private static void function_2() {
        File[] fileArr = File.listRoots();
        for (File f : fileArr) {
            System.out.println(f);
        }
    }

    private static void function_1() {
        File file = new File("d:\\");
        File[] fileArr = file.listFiles();
        for (File f : fileArr) {
            System.out.println(f);
        }
    }

    private static void function() {
        File file = new File("d:\\");
        String[] strArr = file.list();
        System.out.println(strArr.length);
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
