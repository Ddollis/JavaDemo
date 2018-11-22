package cn.wust.demo1;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class MyFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".zip");
    }
}
