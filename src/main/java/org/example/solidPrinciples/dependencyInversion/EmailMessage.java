package org.example.solidPrinciples.dependencyInversion;

public class EmailMessage implements MessageSender{
    @Override
    public void send(String message) {
        System.out.println(" Email Message ");
    }
}
