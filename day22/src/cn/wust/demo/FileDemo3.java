package cn.wust.demo;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        function_3();
    }

    private static void function_3() {
        File file = new File("d:\\Java\\jre7\\README.txt");
        File parent = file.getParentFile();
        System.out.println(parent);
    }

    private static void function_2() {
        File file = new File("src");
        File absolute = file.getAbsoluteFile();
        System.out.println(absolute);
    }

    private static void function_1() {
        File file = new File("d:\\Java\\jre7\\README.txt");
        long length = file.length();
        System.out.println(length);
    }

    private static void function() {
        File file = new File("d:\\Java\\jre7\\README.txt");
        /*String name = file.getName();
        System.out.println(name);*/
        String path = file.getPath();
        System.out.println(path);
        System.out.println(file);
    }
}
