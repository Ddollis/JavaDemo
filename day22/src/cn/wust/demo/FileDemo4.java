package cn.wust.demo;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args){
        function_1();
    }

    private static void function_1() {
        File file = new File("d:\\Java\\jre7");
        if(file.exists()){
            boolean b = file.isDirectory();
            System.out.println(b);
        }
    }

    private static void function() {
        File file = new File("d:\\Java\\jre7\\README.txt");
        boolean b = file.exists();
        System.out.println(b);
    }
}
