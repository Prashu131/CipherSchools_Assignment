package Assignment_6;

import java.util.Arrays;

public class Longest_Substring {
    static final int NO_OF_CHARS = 256;
    static int longestUniqueSubsttr(String str)
    {
        int n = str.length();
        int res = 0;
        int [] lastIndex = new int[NO_OF_CHARS];
        Arrays.fill(lastIndex, -1);
        int i = 0;
        for (int j = 0; j < n; j++) {
            i = Math.max(i, lastIndex[str.charAt(j)] + 1);
            res = Math.max(res, j - i + 1);
            lastIndex[str.charAt(j)] = j;
        }
        return res;
    }
    public static void main(String[] args)
    {
        String str = "This is a Java program";
        System.out.println("The input string is " + str);
        int len = longestUniqueSubsttr(str);
        System.out.println("The length of " + "the longest non repeating character is " + len);
    }
}

