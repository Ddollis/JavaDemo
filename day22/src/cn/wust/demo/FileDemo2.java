package cn.wust.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args)throws IOException{
        function_2();
    }

    private static void function_2() {
        File file = new File("d:\\b.txt");
        boolean b = file.delete();
        System.out.println(b);
    }

    private static void function_1() {
        File file = new File("d:\\abc");
        boolean b = file.mkdirs();
        System.out.println(b);
    }

    private static void function() throws IOException {
        File file = new File("d:\\a.txt");
        boolean b = file.createNewFile();
        System.out.println(b);
    }
}
