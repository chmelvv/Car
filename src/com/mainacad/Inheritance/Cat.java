package com.mainacad.Inheritance;

public class Cat extends Animal{

    public Cat(int height, String color) {
        super(height, color);
        setMessage("Meow");
    }

    public int getHeight() {
        System.out.println("Set Height in Cat");
        return super.getHeight() + 1;
    }

//    @Override
//    public String toString(){
//        return super.toString() + "Meow, Meow";
//    }
}
