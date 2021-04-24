import task.LongestCommonPrefix;
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
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] str = new String[3];
        str[0] = "flower";
        str[1] = "flow";
        str[2] = "flight";
        System.out.println(longestCommonPrefix.longestCommonPrefix(str));
    }

}
