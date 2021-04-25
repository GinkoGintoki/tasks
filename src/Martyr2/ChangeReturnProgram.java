package Martyr2;

public class ChangeReturnProgram {
    public static void change(double cost, double money) {
        double quarter = 0;
        double dime = 0;
        double nickel = 0;
        double pennies = 0;

        //cost - 100.06
        //money - 120
        //19.93
        //3 x quarter, 1 x dime
        double change = money - cost;
        int dollars = (int) change;
        double underDollar = change - dollars;

        System.out.println(dollars + " " + underDollar);

        while (underDollar >= 0.25) {
            quarter += 0.25;
            underDollar -= 0.25;
        }

        while (underDollar >= 0.1) {
            dime += 0.1;
            underDollar -= 0.1;
        }

        while (underDollar >= 0.05) {
            nickel += 0.05;
            underDollar -= 0.05;
        }

        while (underDollar > 0) {
            System.out.println("P");
            pennies += 0.01;
            underDollar -= 0.01;
        }
        String res = "";
        if (dollars > 0) {
            res += dollars + " dollar";
        }
        if (quarter > 0) {
            res += ", " + (int) (quarter / 0.25) + " quarters";
        }
        if (dime > 0) {
            res += ", " + (int) (dime / 0.1) + " dimes";
        }
        if (nickel > 0) {
            res += ", " + (int) (nickel / 0.05) + " nickels";
        }
        if (pennies > 0) {
            res += ", " + (int) (pennies / 0.01) + " pennies";
        }
        res += ".";

        System.out.println("Your change - " + res);

    }
}
