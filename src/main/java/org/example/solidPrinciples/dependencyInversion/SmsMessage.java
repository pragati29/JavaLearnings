package org.example.solidPrinciples.dependencyInversion;

public class SmsMessage implements MessageSender{
    @Override
    public void send(String message) {
        System.out.println(" SMS Message ");
    }
}
