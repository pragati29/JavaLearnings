package org.example.generics;

public class Box<T>{

    private T t;

    public T get(){
        return this.t;
    }

    public Box(T t) {
        this.t = t;
    }
}
