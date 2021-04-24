package leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        int result;
        boolean bool = false;
        if (x < 0) {
            x = x * (-1);
            bool = true;
        }
        String s = String.valueOf(x);
        StringBuilder res = new StringBuilder();
        if (s.length() == 1) {
            return x;
        }
        for (int i = s.length(); i > 0; i--) {
            res.append(s.charAt(i - 1));
        }
        try {
            result = Integer.parseInt(res.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        if (bool) {
            result = result * (-1);
        }
        return result;
    }
}
