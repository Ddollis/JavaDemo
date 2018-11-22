package cn.wust.Demo2;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class MyJavaFilter implements  FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".exe");
    }

}
