package com.mainacad.Inheritance;

public class Dog extends Animal implements Jumpable{

    public Dog(int height, String color) {
        super(height, color);
        setMessage("Woof");
}


    @Override
    public void makeAJump() {
        System.out.println("Jump!");
    }
}
