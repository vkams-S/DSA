package FILEIO;

import javax.sound.midi.Soundbank;
import java.io.*;

public class fileIO {
    public static void main(String[] args) {
// Writing into the file using FileWritter (char by char) and FileOutputStream byte by byte
       /* try{
            File file = new File("C:/Users/vkams/Documents/sep-22/2909/students.txt");
            file.createNewFile();
            FileWriter writer = new FileWriter(file,true);
            writer.write("Hello word!! \n");
            writer.write("Hello\n");
            writer.close();
            FileOutputStream os = new FileOutputStream(file,true);
            os.write(("Writing byte by byte").getBytes());
            os.close();
        }catch (Exception e)
        {
            System.err.println("Something went wrong! "+e);
        }*/
// File reading using FileReader char by char and FileInputStream byte by byte
        try{
            File file = new File("C:/Users/vkams/Documents/sep-22/2909/students.txt");
            FileReader reader = new FileReader(file);
           /* int i;
            while ((i=reader.read())!=-1) {
                System.out.print((char)i);
            }*/
            BufferedReader br = new BufferedReader(reader);
            String line="";
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
            reader.close();
            br.close();
            System.out.println("Reading from InputStream!");
            FileInputStream is = new FileInputStream(file);
            int ch =0;
            while((ch=is.read())!=-1)
            {
                System.out.print((char)ch);
            }
           is.close();

        }catch (Exception e)
        {
            System.err.println("Something went wrong! "+e);
        }

    }
}
