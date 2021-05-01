package Martyr2.ComplexNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComplexNumber {
    public void menu() {
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Negation\n 6. Inversion");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String in = "";
        try {
            in = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Enter numbers: ");
        String ca = null;
        ComplexAlgorithm[] numbers = new ComplexAlgorithm[2];
        if (Double.parseDouble(in) >= 1 && Double.parseDouble(in) <= 4) {
            for (int i = 0; i < 2; i++) {
                try {
                    ca = bf.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ComplexAlgorithm algorithm = parser(ca);
                numbers[i] = algorithm;
            }
        } else {
            try {
                ca = bf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ComplexAlgorithm algorithm = parser(ca);
            numbers[0] = algorithm;
        }

        ComplexAlgorithm complexAlgorithm = null;

        switch (in) {
            case "1" -> complexAlgorithm = ComplexAlgorithm.addition(numbers[0], numbers[1]);
            case "2" -> complexAlgorithm = ComplexAlgorithm.subtraction(numbers[0], numbers[1]);
            case "3" -> complexAlgorithm = ComplexAlgorithm.multiplication(numbers[0], numbers[1]);
            case "4" -> complexAlgorithm = ComplexAlgorithm.division(numbers[0], numbers[1]);
            case "5" -> complexAlgorithm = ComplexAlgorithm.negation(numbers[0]);
            case "6" -> complexAlgorithm = ComplexAlgorithm.inversion(numbers[0]);
            default -> System.out.println("Wrong.");
        }

        System.out.println(complexAlgorithm);
    }

    private ComplexAlgorithm parser(String ca) {
        double[] numbers = new double[2];

        ca = ca.replaceAll(" ", "");
        Pattern pattern = Pattern.compile("(\\d+)|(-\\d+)");
        Matcher matcher = pattern.matcher(ca);

        for (int i = 0; i < numbers.length; i++) {
            if (matcher.find()) {
                numbers[i] = Double.parseDouble(matcher.group());
            }
        }

        return new ComplexAlgorithm(numbers[0], numbers[1]);
    }
}
