package Martyr2;

public class FactorialFinder {

    public static long factorial(long integer) {
        long factorial = 1;

        if (integer == 0) {
            return factorial;
        }

        for (long i = 1; i <= integer; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static long factorialRecursion(long integer) {
        if(integer>0) {
            return factorialRecursion(integer - 1) * integer;
        }
        return 1;
    }
}
