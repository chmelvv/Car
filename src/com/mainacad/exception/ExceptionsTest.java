package com.mainacad.exception;

public class ExceptionsTest {

    public static void main(String[] args) {

        int[] myArray = {0, 1, 2};

        try {
            int y = myArray[5];
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println( "Error!" );
            return;
        } finally {

            System.out.println( "Finally" );
        }

    }
}
