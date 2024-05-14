package org.example.solidPrinciples.dependencyInversion;

public class NotificationService {

   private MessageSender messageSender;
    NotificationService(MessageSender messageSender){
        this.messageSender=messageSender;
    }

    void notifyUser(String message){
        messageSender.send("MessageCheck");
    }

    public static void main(String[] args) {
        NotificationService notificationService=new NotificationService(m->{

        });

    }
}
