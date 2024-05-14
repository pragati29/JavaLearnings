package org.example.oopsConcepts.thiSuper;

import java.util.concurrent.Executors;

public class Bar extends Boo{
    Bar(){
        super();

        System.out.println("Bar");

    }
    Bar(String arg){
        super();
        System.out.println(arg);
    }

    public static void main(String[] args) {
        new Bar();

    }

    void main1(){
        method1();
    }
}
