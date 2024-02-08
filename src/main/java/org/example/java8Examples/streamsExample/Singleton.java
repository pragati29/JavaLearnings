package org.example.java8Examples.streamsExample;

public class Singleton {

    private static Singleton obj;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(obj==null){
            obj = new Singleton();
        }
        return obj;
    }
}
