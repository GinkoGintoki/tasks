import task.RomanToInteger;

public class Main {
    public static void main(String[] args) {
/*        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000*/
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("IV"));
    }

}
