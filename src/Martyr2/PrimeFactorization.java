package Martyr2;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    public List<Integer> primeFactorization(int number) {
        List<Integer> fact = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                fact.add(i);
                number /= i;
            }
        }

        return fact;
    }
}
