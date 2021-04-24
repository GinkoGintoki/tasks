import Martyr2.Fibonacci;
import Martyr2.FindPiToTheNthDigit;
import leetcode.SearchInsertPosition;

public class Main {
    public static void main(String[] args) {
/*        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000*/
        Fibonacci fibonacci = new Fibonacci();
        long fibonacci1 = fibonacci.fibonacci(7);
        System.out.println(fibonacci1);
    }

}
