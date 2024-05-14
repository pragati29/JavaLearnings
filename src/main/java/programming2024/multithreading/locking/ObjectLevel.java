package programming2024.multithreading.locking;

public class ObjectLevel {
    public int sharedResource = 1;

    public final Object lock = new Object();

    public void increment() {
        synchronized (lock) {
            sharedResource++;
            System.out.println("increment "+Thread.currentThread().getName() + " " + sharedResource);
        }
    }

    public void decrement() {
        synchronized (lock) {
            sharedResource--;
            System.out.println("decrement "+Thread.currentThread().getName() + " " + sharedResource);
        }
    }
}
