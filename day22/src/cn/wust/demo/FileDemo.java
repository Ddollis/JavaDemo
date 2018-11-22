package cn.wust.demo;

import java.io.File;

/**
 * java.io.File
 * 将操作系统中的,文件,目录(文件夹),路径,封装成File对象
 * 提供方法,操作系统中的内容
 * File与系统无关的类
 * 文件 file
 * 目录 directory
 * 路径 path
 */
public class FileDemo {
    public static void main(String[] args) {
        String separator = File.pathSeparator;
        System.out.println(separator);

        separator = File.separator;
        System.out.println(separator);
    }
}
