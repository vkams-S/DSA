package JAVA8Features;
// Functional Interface can have only one abstract method but any number of default and static methods.
@java.lang.FunctionalInterface
interface Email{
    String EmailClient="Gmail";
    String sendEmail(String from,String to,String subject,String body);
    default void onEmailSend(){
        System.out.println("Email send successfully!"+EmailClient);
    }
    static void setUpClient(){
        System.out.println("Setting up client..."+EmailClient);
    }
}

class EmailClient implements Email{

    @Override
    public String sendEmail(String from, String to, String subject, String body) {
        System.out.println("Sending Email with Subject: "+subject);
        System.out.println("Email Body: "+body);
        System.out.println("Email Sent from "+from+" to "+to);
        return "Email Sent";
    }

}
//Also a Functional Interface since it has only one abstract method
interface hello{
    void hello();
}
public class FunctionalInterface {


    public static void main(String[] args) {
        Email Client = new EmailClient();
        String response = Client.sendEmail("vkams@amazon.com","mohoroy@amazon.com","Hi","Hi Mohor!");
        System.out.println(response);
        Client.onEmailSend();
        Email.setUpClient();
    }

}
