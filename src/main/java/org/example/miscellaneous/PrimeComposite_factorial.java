package org.example.miscellaneous;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class PrimeComposite_factorial {
    static void primeOrComposite(int n){
        for(int i=2;i<=n/2;i++) {
            if ( n % i == 0) {
                System.out.println("Prime");
                break;
            } else {
                System.out.println("Composite");
            }
        }
    }


   static void findFactorial(int n){
       Consumer<Long> resultConsumer=(x)-> System.out.println(x);
       long result = 1;
       for (int i = 1; i <= n; i++) {
           result *= i;
       }
       resultConsumer.accept(result);
    }


    public static void main(String[] args) {
       // findFactorial(7);
        primeOrComposite(7);
      //  System.out.println(7/2);
    }
}
