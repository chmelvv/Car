import java.util.Arrays;

public class PrimeNumbers {

    public static void main(String[] args) { //Expected output:

        printArray( generatePrimeNumbers(100)); //[1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 0, 0, ....
        printArray( generatePrimeNumbers(-10) ); // null
        printArray( generatePrimeNumbers(0) ); // null
        printArray( generatePrimeNumbers(1) ); // [1]
        printArray( generatePrimeNumbers(2) ); // [1, 2]
    }

    private static void printArray( int[] array){

        System.out.println(Arrays.toString(array));
    }

    private static int[] generatePrimeNumbers(int n) {

        if ( n <= 0) {
            return null;
        }

        int[] result = new int[n];

        if ( n >= 1 ) {
            result[0] = 1;
        }

        if ( n >= 2) {
            result[1] = 2;
        }

        int arrayIndex = 1;
        boolean isPrime;

        for (int i = 3; i <= n; i+=2) { //Prime number candidates generator
            isPrime = true;
            for ( int d = 2; d < i; d++) { // Divider generator
                if ( i % d == 0) {
                    isPrime = false;
                    break;
                }
            }
            if ( isPrime ) {
                result[ ++arrayIndex ] = i;
            }
        }

        return result;
    }
}
