package com.ky.mediahelper;

import java.io.File;
import java.util.ArrayList;

public class MediaFile {
    public static ArrayList<String> getFiles(String path){
//        "C:\\xampp\\tomcat\\webapps\\webapp\\uploads"
        ArrayList<String> allfiles=new ArrayList<>();
        File file=new File(path);
        File[] files=file.listFiles();
        if(files.length>0){
            for(File f:files){
                allfiles.add(f.getName());
            }
        }
        return allfiles;
    }
    public static boolean delete(String path){
        boolean status=false;
        File file=new File(path);
        if(file.delete()){
            status=true;
        }
        return status;
    }
}
