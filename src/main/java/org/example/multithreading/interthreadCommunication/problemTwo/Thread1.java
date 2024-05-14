package org.example.multithreading.interthreadCommunication.problemTwo;

public class Thread1 implements Runnable {
    Chat chat;
    String[] s1 = {"Hi", "How are you ?", "I am also doing fine!"};

    Thread1(Chat chat) {
        this.chat = chat;

    }

    @Override
    public void run() {
        for (int i = 0; i < s1.length; i++) {
            chat.Question(s1[i]);
        }
    }
}
