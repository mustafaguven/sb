package com.timboict.saglikbakanligi.util;

import android.os.Environment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by mustafaguven on 24.05.2015.
 */
public class FileUtil {


    public static String createFolder(String folderName){
        String path = String.format("%s/%s/%s", Environment.getExternalStorageDirectory().getAbsolutePath(), "sb_photo", folderName);
        File directory = new File(path);
        directory.mkdirs();
        return path;
    }

    public static File newFile(String folderName) {
        String path = createFolder(folderName);
        String file = String.format("%s/%s.jpg", path, System.currentTimeMillis());
        File newfile = new File(file);
        try {
            newfile.createNewFile();
        } catch (IOException e) {}
        return newfile;
    }
}
