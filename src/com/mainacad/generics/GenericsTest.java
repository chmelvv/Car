package com.mainacad.generics;

public class GenericsTest {

    public static void main(String[] args) {

        MyBox<Integer> myBox = new MyBox<>();
        myBox.setT( 10 );

        myBox.setT( "AAA" );

        MyBox myBoxRaw = new MyBox();
        myBoxRaw.setT(0.5);
        myBoxRaw.setT("dddd");

    }
}
