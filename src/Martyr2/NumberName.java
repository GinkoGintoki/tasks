package Martyr2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NumberName {

    private static final String[] DIGIT= {"SодинS","SдваS","SтриS","SчетыреS","SпятьS","SшестьS","SсемьS","SвосемьS","SдевятьS"};
    private static final String[] DECIMAL = {"SдвадцатьS","SтридцатьS","SсорокS","SпятьдесятS","SшестьдесятS","SсемьдесятS","SвосемьдесятS","SдевяностоS"};
    private static final String[] HUNDRED = {"SстоS","SдвестиS","SтристаS","SчетырестаS","SпятьсотS","SшестьсотS","SсемьсотS","SвосемьсотS","SдевятьсотS"};
    private static final String[] SPECIAL = {"SдесятьS","SодиннадцатьS","SдвенадцатьS","SтринадцатьS","SчетырнадцатьS","SпятнадцатьS","SшестнадцатьS","SсемнадцатьS","SвосемнадцатьS","SдевятнадцатьS"};

    public static void name(){
        int input = 0;
        System.out.print("Enter a number: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = Integer.parseInt(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        String number = String.valueOf(input);
        StringBuilder sb = new StringBuilder();
        if (number.startsWith("-")) {
            sb.append("МинусS");
            number = number.substring(1);

            if (number.length() > 9) {
                System.err.println("The number is too long");
                return;
            }
        }

        ArrayList<String> num = new ArrayList<>();
        if (number.length() > 3) {
            while (number.length() > 3) {
                num.add(number.substring(number.length() - 3));
                number = number.substring(0, number.length() - 3);
            }
            if (!number.isBlank())
                num.add(number);
        }
        else
        if (!number.isBlank())
            num.add(number);

        Collections.reverse(num);

        int i = num.size();
        for (String s : num) {
            for (int j = 0; j < 3; j++) {
                if (s.length() == 3 && j == 0)
                    sb.append(getHundredsName(s.charAt(j)));
                if (j == 1) {
                    if (checkSpecial(s)) {
                        sb.append(getSpecialName(s));
                        j += 2;
                    }
                    else
                    if (s.length() >= 2)
                        sb.append(getDecimalsName(s.charAt((s.length() == 2) ? 0 : j)));
                }
                if (j == 2) {
                    boolean isThousand = i == 2;
                    int k = j;
                    if (s.length() == 2)
                        k = 1;
                    if (s.length() == 1)
                        k = 0;
                    sb.append(getDigitName(s.charAt(k), isThousand));
                }
            }
            sb.append(getAdditionalWord(s, i));
            i--;
        }

        String output = sb.toString();
        output = output.replaceAll("S+", " ").trim();
        if (Character.isLowerCase(output.charAt(0))) {
            output = Character.toUpperCase(output.charAt(0)) + output.substring(1);
        }

        System.out.println(output);
    }

    private static String getDigitName(char c, boolean isThousand) {
        if (c == '1') {
            if (isThousand)
                return "SоднаS";
            else
                return DIGIT[0];
        }
        System.out.println(c);
        return DIGIT[Integer.parseInt(String.valueOf(c)) - 1];
    }

    private static String getAdditionalWord(String s, int flag) {
        if (flag == 3 || flag == 2)
            flag -= 2;
        else
            return "";
        String[][] words = {
                { "SтысячаS", "SтысячиS", "SтысячS" },
                {"SмиллионS", "SмиллионаS", "SмиллионовS" }
        };
        if (checkSpecial(s))
            return words[flag][2];
        char d = s.charAt(s.length() - 1);
        if (d == '0' || d == '5' || d == '6' || d == '7' || d == '8' || d == '9')
            return words[flag][2];
        if (d == '1')
            return words[flag][0];
        if (d == '2' || d == '3' || d == '4')
            return words[flag][1];

        return "";
    }

    private static String getHundredsName(char c) {
        System.out.println(c);
        return HUNDRED[Integer.parseInt(String.valueOf(c))-1];
    }

    private static String getDecimalsName(char c) {
        System.out.println(c);
        return DECIMAL[Integer.parseInt(String.valueOf(c))-2];
    }

    private static boolean checkSpecial(String s) {
        return s.endsWith("10") || s.endsWith("11") || s.endsWith("12") || s.endsWith("13")
                || s.endsWith("14") || s.endsWith("15") || s.endsWith("16")
                || s.endsWith("17") || s.endsWith("18") || s.endsWith("19");
    }

    private static String getSpecialName(String s) {
        return SPECIAL[Integer.parseInt(String.valueOf(s.charAt(1)))];
    }
}
