package cn.wust.demo;

import java.io.File;

/**
 * File类的构造方法
 * 三种重载形式
 */
public class FileDemo1 {
    public static void main(String[] args){
        function();
    }

    private static void function() {
        File file = new File("d:\\Java");

        System.out.println(file);
    }

    private static void function_1() {
        File file = new File("d:","Java");
        System.out.println(file);
    }

    private static void function_2() {
        File parent = new File("d:");
        File file = new File(parent,"Java");
        System.out.println(file);
    }
}
