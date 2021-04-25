package Martyr2;

import java.text.NumberFormat;

public class MortgageCalculator {
    public static void mortgageCalculator(double percent, double cost, int months, double salary) {
        System.out.println("Monthly payment: " + NumberFormat.getInstance().format((cost + cost * percent / 100) / months));
        System.out.println("You close payment for: " + NumberFormat.getInstance().format((int)(cost + cost * percent / 100)/(int)salary));
    }
}
