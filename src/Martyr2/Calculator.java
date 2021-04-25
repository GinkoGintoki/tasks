package Martyr2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    private static final String[] binary = {"+", "-", "*", "/"};
    private static final String[] prefix = {"log", "ln", "sin", "cos", "tan", "ctg"};

    public static void main() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        try {
            input = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(input);
        input = input.toLowerCase(Locale.ROOT);
        input = input.replaceAll(" ", "");


        String[] list = input.split("[A-Za-z()+*/-]+");

        Pattern pattern = Pattern.compile("[+\\-/*]|(c(?:os|tg)|sin|tan)|(l(?:og|n))");
        Matcher matcher = pattern.matcher(input);
        String function = "";

        if (matcher.find()) {
            function = matcher.group();
        }

        List<Double> doubles = new ArrayList<>();
        for (String s : list) {
            if (!s.isEmpty()) {
                doubles.add(Double.valueOf(s));
            }
        }
        if (doubles.size() == 1) {
            calculator(doubles.get(0), function);
        } else {
            calculator(doubles.get(0), doubles.get(1), function);
        }

        try {
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void calculator(double a, double b, String function) {
        if (function.equals("+")) {
            System.out.print(" = " + (a + b));
        }
        if (function.equals("-")) {
            System.out.print(" = " + (a - b));
        }
        if (function.equals("*")) {
            System.out.print(" = " + (a * b));
        }
        if (function.equals("/")) {
            System.out.print(" = " + (a / b));
        }
    }

    public static void calculator(double a, String function) {
        if (function.equals("log")) {
            System.out.print(" = " + Math.log10(a));
        }
        if (function.equals("ln")) {
            System.out.print(" = " + Math.log(a));
        }
        if (function.equals("sin")) {
            System.out.print(" = " + Math.sin(a));
        }
        if (function.equals("cos")) {
            System.out.print(" = " + Math.cos(a));
        }
        if (function.equals("tan")) {
            System.out.print(" = " + Math.tan(a));
        }
        if (function.equals("ctg")) {
            System.out.print(" = " + Math.cos(a) / Math.sin(a));
        }
    }
}
