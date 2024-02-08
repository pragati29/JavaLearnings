package org.example.miscellaneous.Problems;

public class Client {
        public static void main(String[] args) {
            Printer p1=new Printer(100, 1, 1);
           // Printer p2=new Printer(100, 1, 2);
            Printer p3=new Printer(100, 1, 0);

            Thread t1=new Thread(p1, "T1");
            Thread t2=new Thread(p3, "T2");
           // Thread t3=new Thread(p3, "T3");
            t1.start();
          //  t2.start();
            t2.start();
        }

}
