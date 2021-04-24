package Martyr2;

public class FindPiToTheNthDigit {
    public void findPi(int digit){
        String pi = String.valueOf(Math.PI);
        double piDigit = Double.parseDouble(pi.substring(0,digit + 2));
        System.out.println(piDigit);
    }
}
