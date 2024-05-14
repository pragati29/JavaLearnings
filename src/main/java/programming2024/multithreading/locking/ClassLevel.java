package programming2024.multithreading.locking;

import java.util.PriorityQueue;
import java.util.function.Function;

public class ClassLevel {
    public static int sharedResource=1;

    public static void increment(){
        synchronized (ClassLevel.class){
            sharedResource++;
            System.out.println(Thread.currentThread().getName()+ " increment " +sharedResource);
        }
    }

    public static void decrement(){
        synchronized (ClassLevel.class){
            sharedResource--;
            System.out.println(Thread.currentThread().getName()+ " decrement " +sharedResource);
            //PriorityQueue
        }
    }
}
