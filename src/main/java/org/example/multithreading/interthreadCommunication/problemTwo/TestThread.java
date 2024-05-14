package org.example.multithreading.interthreadCommunication.problemTwo;

public class TestThread {
    public static void main(String[] args) {
        Chat chat = new Chat();
        Thread1 t11 = new Thread1(chat);
        Thread2 t12 = new Thread2(chat);
        Thread t1 = new Thread(t11);
        Thread t2 = new Thread(t12);
        t1.start();
        t2.start();
    }
}
