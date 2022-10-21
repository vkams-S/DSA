package DataStructures.Sortings;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAPIDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        formater.format(date);
        try {
            Date mydate = formater.parse("21/07/2022 10:28:22");
            System.out.println(mydate);
            System.out.println(formater.format(mydate));
        }catch (Exception e)
        {
            System.err.println("Something is wrong with date parsing");
        }
    }
}
