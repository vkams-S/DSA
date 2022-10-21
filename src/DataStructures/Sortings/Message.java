package DataStructures.Sortings;

import java.util.Date;

public class Message {
    String text;
    Date timeStamp;
    int status; //1->sent, 2->delivered, 3->read
    String from;
    String to;

    public Message() {
        this("NA",new Date(),0,"NA","NA");
    }

    public Message(String text, Date timestamp, int status, String from, String to) {
        this.text = text;
        this.timeStamp = timestamp;
        this.status = status;
        this.from = from;
        this.to = to;
    }

    String statusToString(int status)
    {
        if(status==1) return "Sent!";
        if(status==2) return "Delivered!";
        if(status==3) return "Seen!";
        return "NA";

    }
    void showMessage() {
        System.out.println("------------------------------------");
        System.out.println(text);
        System.out.println(timeStamp);
        System.out.println(statusToString(status));
        System.out.println("Sender: "+from+" Receiver: "+to);
        System.out.println("------------------------------------");
        System.out.println();
    }

}
