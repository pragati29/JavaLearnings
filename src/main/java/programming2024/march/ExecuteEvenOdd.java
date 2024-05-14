package programming2024.march;

public class ExecuteEvenOdd {

    int counter = 0;
     int x;

    public ExecuteEvenOdd(int x) {
        this.x = x;
    }

    public void printOddNums() {
        synchronized (this) {
            while (counter < x) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter +" "+ Thread.currentThread().getName());
                counter++;
                notify();
            }
        }
    }

    public void printEvenNums()
    {
        synchronized (this)
        {
            while (counter < x) {
               /* while (counter % 2 == 0) {
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }*/
                System.out.println(counter +" "+ Thread.currentThread().getName());
                counter+=2;
                //notify();
            }
        }
    }


}
