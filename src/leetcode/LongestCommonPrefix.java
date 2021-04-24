package leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        char[] prefix = strs[0].toCharArray();
        int max = prefix.length;
        for (int i = 1; i < strs.length; i++) {
            int idx = 0;
            char[] curr = strs[i].toCharArray();
            while (idx < Math.min(max, curr.length) && prefix[idx] == curr[idx])
                idx++;
            max = idx;
        }
        return strs[0].substring(0, max);
    }
}
