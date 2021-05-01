package Martyr2;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    public static void happyNumber(int number) {
        List<Integer> list = new ArrayList<>();

        while (list.size() < 8) {
            int temp = number;
            while (temp != 1) {
                temp = sumNumbers(temp);
                if (temp == 4) {
                    break;
                }
            }
            if (temp == 1) {
                list.add(number);
            }
            number++;
        }

        System.out.println("Happy numbers:");
        System.out.println(list);
    }

    private static int sumNumbers(int number) {
        List<Integer> list = new ArrayList<>();
        String string = String.valueOf(number);
        for (int i = 0; i < string.length(); i++) {
            list.add(Character.getNumericValue(string.charAt(i)));
        }
        int sum = 0;

        for (Integer integer : list) {
            sum += integer * integer;
        }

        return sum;
    }
}
