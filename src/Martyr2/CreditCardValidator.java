package Martyr2;

public class CreditCardValidator {
    private final static String[] vendors = {"MasterCard", "VISA", "American Express"};

    public static String CardValidator(String number) {
        if (isValid(number)) {
            String vendor = "";
            if (Integer.parseInt(number.substring(0, 1)) == 5) {
                vendor = vendors[0];
            }
            if (Integer.parseInt(number.substring(0, 1)) == 4) {
                vendor = vendors[1];
            }
            if (Integer.parseInt(number.substring(0, 1)) == 3) {
                vendor = vendors[2];
            }
            return "Your card is valid, and vendor is " + vendor + ".";
        }
        return "Your card isn't valid.";
    }

    private static boolean isValid(String number) {
        number = number.replaceAll(" ", "");
        int[] numbers = new int[number.length()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        int sum = 0;
        int j = 1;


        for (int i = numbers.length - 1; i > -1; i--) {
            if (j % 2 == 0) {
                int n = numbers[i] * 2;
                if (n > 9) {
                    n = n / 10 + n % 10;
                }
                sum += n;
            } else {
                sum += numbers[i];
            }
            j++;
        }

        return sum % 10 == 0;
    }
}
