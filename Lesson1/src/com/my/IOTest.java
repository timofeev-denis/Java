package com.my;

import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class IOTest {
    public static void main(String[] args) throws IOException {
//        listFiles("f:\\tmp\\bin");
        spy("f:\\tmp\\bin2");
    }

    private static void spy(String pathToWatch) throws IOException {
        Path path = FileSystems.getDefault().getPath(pathToWatch);
        WatchService ws = path.getFileSystem().newWatchService();
        path.register(ws, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE);
        WatchKey watch = null;
        while(true) {
            try {
                watch = ws.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static void listFiles(String path) {
        File fileList = new File(path);
        if(fileList.canRead()){
            FilenameFilter filter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    if(name.substring(name.length() - 3).equals("php")) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            for(String file : fileList.list(filter)) {
                System.out.println(file);
            }
        } else {
            System.out.println("Cannot read!");
        }
    }
}
