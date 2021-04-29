package Martyr2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxCalculator {

    public static void tax(String tax) {
        String[] strings = tax.split("\\s");

        double cost = 0;
        double percent = 0;
        for (String s :
                strings) {
            if (s.matches("\\d+")) {
                cost = Double.parseDouble(s);
            }
            if (s.equalsIgnoreCase("state")) {
                percent = 0.5;
            }
            if (s.equalsIgnoreCase("country")) {
                percent = 0.1;
            }
        }

        System.out.println("Your total cost - " + (float)(cost * (1 + percent)));
    }
}
