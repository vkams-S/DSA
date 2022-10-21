package JAVA8Features;

import java.util.Date;

@java.lang.FunctionalInterface
interface Notification{
    void notifyUser();
}

class User implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("A notification received at :"+new Date());
    }
}
@java.lang.FunctionalInterface
interface Payment{
    String pay(int amount);
}

public class SingleParameterLambdaExpression {
    public static void main(String[] args) {
        Notification notification1 = new User();
        notification1.notifyUser();

        //using anonymous class
        Notification notification2 = new Notification() {
            @Override
            public void notifyUser() {
                System.out.println("``````````````````````````````");
                System.out.println("Anonymous Class Implementation");
                System.out.println("A New Notification Received at "+ new Date());
                System.out.println("``````````````````````````````");
            }
        };
        notification2.notifyUser();

        //using lambda expression
        Notification notification3 = () -> {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Lambda Expression Implementation");
            System.out.println("A New Notification Received at "+ new Date());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        };
        notification3.notifyUser();

        Payment pay = (parameter) ->
        {
            System.out.println("Processing Payment for amount: "+parameter);
            System.out.println("Payment Successfully Received");
            return "Payment Process Finished";
        };
        String response = pay.pay(3000);
        System.out.println(response);
    }

}
