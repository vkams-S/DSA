package DataStructures.Sortings;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BubbleSortMessageApp {

    static void bubbleSortMessagesBasedOnMessageTextLength(Message[] messages) {

        int size = messages.length;
        for(int idx=0;idx<size-1;idx++) {
            for(int cmpIdx=0; cmpIdx<size-idx-1; cmpIdx++) {
                if(messages[cmpIdx].text.length() > messages[cmpIdx+1].text.length()) {
                    Message temp = messages[cmpIdx];
                    messages[cmpIdx] = messages[cmpIdx+1];
                    messages[cmpIdx+1] = temp;
                }
            }
        }
    }

    static void bubbleSortMessagesOnDate(Message[] messages) {

        int size = messages.length;
        for(int idx=0;idx<size-1;idx++) {
            for(int cmpIdx=0; cmpIdx<size-idx-1; cmpIdx++) {
                if(messages[cmpIdx].timeStamp.compareTo(messages[cmpIdx+1].timeStamp) < 0) {
                    Message temp = messages[cmpIdx];
                    messages[cmpIdx] = messages[cmpIdx+1];
                    messages[cmpIdx+1] = temp;
                }
            }
        }
    }
    static void printMessages(Message[] messages) {
        for(Message message : messages) {
            message.showMessage();
        }
    }
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date1=null,date2=null,date3=null,date4=null,date5=null;
        try{
            date1 = formatter.parse("08/10/2022 02:59:00");
            date2 = formatter.parse("07/10/2022 12:50:00");
            date3 = formatter.parse("06/10/2022 22:59:00");
            date4 = formatter.parse("09/10/2022 11:15:30");
            date5 = formatter.parse("05/10/2022 08:45:20");

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        Message m1 = new Message("Hello John !!", date1, 2, "+91 99999 11111", "+91 99999 22222");
        Message m2 = new Message("Hi Fionna...", date2, 1, "+91 99999 22222", "+91 99999 11111");
        Message m3 = new Message("Lets hangout for a code session", date3, 3, "+91 99999 33333", "+91 99999 77777");
        Message m4 = new Message("I am plannning to visit a friend. Not Available", date4, 1, "+91 99999 77777", "+91 99999 99999");
        Message m5 = new Message("I will see you soon", date5, 2, "+91 99999 11111", "+91 99999 22222");

        Message[] conversations = new Message[5];
        conversations[0] = new Message("Hello John, This is Fionna from Java Session", date1, 2, "+91 99999 11111", "+91 99999 22222");
        conversations[1] = m2;
        conversations[2] = new Message("I will see you soon", date5, 2, "+91 99999 11111", "+91 99999 22222");
        conversations[3] = m4;
        conversations[4] = new Message("Lets hangout for a code session", date3, 3, "+91 99999 33333", "+91 99999 77777");
       // printMessages(conversations);
        bubbleSortMessagesBasedOnMessageTextLength(conversations);
        printMessages(conversations);
        System.out.println();
        System.out.println("--------------- AFTER DATE SORTING ----------------");
        System.out.println();
        bubbleSortMessagesOnDate(conversations);
        printMessages(conversations);
    }
}
