package com.ky;

import com.ky.mediahelper.MediaFile;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;

public class TestApp {
    public static void main(String[] args) {
        String path="C:\\xampp\\tomcat\\webapps\\webapp\\uploads";
        ArrayList<String> files= MediaFile.getFiles(path);
        for(String item: files){
            System.out.println(item);
        }
    }
}
