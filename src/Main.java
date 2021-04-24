import Martyr2.Fibonacci;
import Martyr2.FindPiToTheNthDigit;
import Martyr2.PrimeFactorization;
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
        PrimeFactorization pf = new PrimeFactorization();

        for (Integer integer:
             pf.primeFactorization(44)) {
            System.out.println(integer);
        }
    }

}
