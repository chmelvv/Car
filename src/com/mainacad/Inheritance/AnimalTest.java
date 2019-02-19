package com.mainacad.Inheritance;

public class AnimalTest {

    public static void main(String[] args) {

        Dog shepherd  = new Dog(50, "Brown");
        Cat siamese  = new Cat(30, "White and Brown");
        System.out.println(shepherd.say());
        System.out.println(siamese.say());

        shepherd.getHeight();
        siamese.getHeight();

        shepherd.makeAJump();

//        System.out.println(shepherd.toString());
//        System.out.println(siamese.toString());
    }
}
