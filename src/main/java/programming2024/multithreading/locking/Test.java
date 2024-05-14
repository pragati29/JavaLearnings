package programming2024.multithreading.locking;

public class Test {
    public static void main(String[] args) {
        ObjectLevel objectLevel = new ObjectLevel();
        Thread t1 = new Thread(() -> {
         for (int i=0;i<5;i++){
             objectLevel.increment();
             try {
                 Thread.sleep(100);
             }catch (Exception e){
                 e.printStackTrace();
             }
         }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++){
                objectLevel.decrement();
                try {
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
