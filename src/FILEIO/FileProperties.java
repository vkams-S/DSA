package FILEIO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class FileProperties {
    public static void main(String[] args) {
        File file = new File("C:/Users/vkams/Documents/sep-22/2909/students.txt");
        if(file.isFile()){
            System.out.println("File is a file! "+file.getName());
        }
        File file1 = new File("C:/Users/vkams/Documents/sep-22/2909/");
        if(file1.isDirectory()){
            System.out.println("File is a directory! "+file1);
        }
        if(file.exists())
        {
            System.out.println("File Exists...");
            file.renameTo(file1);
        }
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/YY HH:MM:SS");
        Date date = new Date(file.lastModified());
        String dateTime =  formater.format(date);
        System.out.println(dateTime);
    }
}
