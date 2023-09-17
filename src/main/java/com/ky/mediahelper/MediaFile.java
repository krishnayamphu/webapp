package com.ky.mediahelper;

import java.io.File;
import java.util.ArrayList;

public class MediaFile {
    public static ArrayList<String> getFiles(String path){
//        "C:\\xampp\\tomcat\\webapps\\webapp\\uploads"
        ArrayList<String> allfiles=new ArrayList<>();
        File file=new File(path);
        File[] files=file.listFiles();
        for(File f:files){
           allfiles.add(f.getName());
        }
        return allfiles;
    }
}
