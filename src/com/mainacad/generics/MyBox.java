package com.mainacad.generics;

public class MyBox<T> {

    private T t;

    public T getT(){
        return t;
    }

    public void setT(T t){
        this.t = t;
    }
}
