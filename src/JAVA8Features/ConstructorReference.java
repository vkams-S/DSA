package JAVA8Features;

@java.lang.FunctionalInterface
interface Message{
    void printSize(String text);
}

class WhatsAppMessage{


    WhatsAppMessage(String message){
        String before = "LS%%^TGA";
        String after = "XFSDSE$$$%#A";
        message = before + message + after;
        System.out.println("Message is: "+message);
        System.out.println("Message Size is: "+message.length());
    }

}
public class ConstructorReference {
    public static void main(String[] args) {
        Message message = WhatsAppMessage :: new;
        message.printSize("This is Awesome");
    }
}
