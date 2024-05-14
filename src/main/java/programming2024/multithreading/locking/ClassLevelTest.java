package programming2024.multithreading.locking;

public class ClassLevelTest {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=0;i<5;i++) {
                ClassLevel.increment();
                try{
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++) {
                ClassLevel.decrement();
                try{
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
