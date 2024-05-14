package org.example.multithreading.interthreadCommunication.problemTwo;

public class Thread2 implements Runnable {
    Chat chat;
    String[] s2 = {"Hi", "I am good, what about you?", "Great!"};

    Thread2(Chat chat) {
        this.chat = chat;

    }

    @Override
    public void run() {
        for (int i = 0; i < s2.length; i++) {
            try {
                chat.Answer(s2[i]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
