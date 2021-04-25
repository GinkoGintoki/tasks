package Martyr2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UnitConverter {
    private static final String[] temp = {"K", "C", "F"};
    private static final String[] mass = {"kg", "lb"};
    private static final String[] time = {"sec", "hour", "min"};

    public static void converter() {
        System.out.println("1. Temperature\n2. Mass\n3. Time");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int point = 0;
        try {
            point = Integer.parseInt(bf.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String value = "";
        System.out.print("Enter value: ");
        if (point == 1) {
            try {
                value = bf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            helpMethod(value, temp);
        }
        if (point == 2) {
            try {
                value = bf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            helpMethod(value, mass);
        }
        if (point == 3) {
            try {
                value = bf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            helpMethod(value, time);
        }
        try {
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void helpMethod(String value, String[] unit) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(value);
        double param = 0;
        if (matcher.find()) {
            param = Double.parseDouble(matcher.group());
        }
        if (unit == temp) {
            if (value.contains(unit[0])) {
                System.out.println("in Celsius - " + (param - 273.15));
                System.out.println("in Fahrenheit - " + ((param - 273.15)*((double)9/5) + 32));
            } else if (value.contains(unit[1])) {
                System.out.println("in Kelvin - " + (param + 273.15));
                System.out.println("in Fahrenheit - " + ((param *((double)9 / 5)) + 32));
            } else {
                System.out.println("in Kelvin - " + ((param - 32) *  ((double)5 / 9) + 273.15));
                System.out.println("in Celsius - " + ((param - 32) *  ((double)5 / 9)));
            }
        } else if (unit == mass) {
            if (value.contains(unit[0])) {
                System.out.println("in Pounds - " + (param / 0.45359237));
            } else {
                System.out.println("in Kilograms - " + (param * 0.45359237));
            }
        } else {
            if (value.contains(unit[0])) {
                System.out.println("in hours - " + (param / 3600));
                System.out.println("in minutes - " + (param / 60));
            } else if (value.contains(unit[1])) {
                System.out.println("in seconds - " + (param * 3600));
                System.out.println("in minutes - " + (param * 60));
            } else {
                System.out.println("in seconds - " + (param * 60));
                System.out.println("in hour - " + (param / 60));
            }
        }
    }
}
