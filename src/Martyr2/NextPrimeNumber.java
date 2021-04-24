package Martyr2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NextPrimeNumber {

    public void prime() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ans = "";
        for (int i = 2; ; i++) {
            if (isPrime(i)) {
                System.out.print(i);
                System.out.print(". Continue? y/n: ");
                try {
                    ans = bf.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (!ans.equals("y")) {
                    break;
                }
            }
        }
    }

    private boolean isPrime(long number) {
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
