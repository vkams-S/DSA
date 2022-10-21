package FILEIO;

import java.io.*;

public class HealthLogger {
    void logVitals(Vitals vital)
    {
        try{
            File file = new File("C:/Users/vkams/Documents/sep-22/2909/Healthloger.csv");
            FileWriter writer = new FileWriter(file);
            writer.write(vital.toString());
            writer.close();

        }catch (Exception e)
        {
            System.out.println("Something went wrong...."+e);
        }
    }

    void logVitalsWithPrint(Vitals vital)
    {
        try{
            File file = new File("C:/Users/vkams/Documents/sep-22/2909/Healthloger-1.csv");
            PrintWriter writer = new PrintWriter(file);
            writer.write(vital.toString());
            writer.close();

        }catch (Exception e)
        {
            System.out.println("Something went wrong...."+e);
        }
    }

    public void readVitals(){
        try{
            File file = new File("C:/Users/vkams/Documents/sep-22/2909/Healthloger.csv");
            if(file.exists())
            {
                FileReader fr = new FileReader(file);
                BufferedReader br= new BufferedReader(fr);
                String Line="";
                while((Line= br.readLine())!=null)
                {
                    String[] vital = Line.split(",");
                    for(String s : vital)
                    {
                        System.out.print(s+"\t");
                    }
                    System.out.println();
                }
            }else{
                System.out.println("File not found!!");
            }
        }catch (Exception e)
        {
            System.out.println("Something went wrong ...."+e);
        }
    }
    public static void main(String[] args) {
       Vitals vital = new Vitals();
       vital.inputVitals();
       HealthLogger hl= new HealthLogger();
       hl.logVitals(vital);
       hl.logVitalsWithPrint(vital);
       hl.readVitals();
    }
}
