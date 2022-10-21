package FILEIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyOperation {
    public void copyfile(File source,File destination)
    {
        try{
            if(source.exists())
            {
                FileReader fr = new FileReader(source);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(destination);
                String Line="";
                boolean commentFlag=false;
                while((Line= br.readLine())!=null)
                {
                    if(Line.trim().startsWith("//"))
                        continue;
                    if(Line.trim().contains("/*"))
                    {
                        commentFlag=true;
                        continue;
                    }
                    if(Line.trim().contains("*/"))
                    {
                        commentFlag=false;
                        continue;
                    }
                    if(commentFlag)
                    {
                        continue;
                    }
                    fw.write(Line+"\n");
                }
                br.close();
                fr.close();
                fw.close();
            }else{
                System.err.println("Source file not found!");
            }

        }catch (Exception e)
        {
            System.out.println("Something went wrong..."+e);
        }
    }

    public static void main(String[] args) {
        FileCopyOperation fcp = new FileCopyOperation();
        File source = new File("C:/Users/vkams/Desktop/ATLAS/JAVA/practice/src/FILEIO/fileIO.java");
        File destination = new File("C:/Users/vkams/Documents/sep-22/2909/test.java");
        fcp.copyfile(source,destination);
    }
}
