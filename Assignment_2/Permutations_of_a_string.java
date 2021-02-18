package Assignment_2;

import java.util.Scanner;

public class Permutations_of_a_string {
    public static void permutation(String s, int start, int end) {
        if (start == end)
            System.out.println(s);
        else {
            for (int i = start; i <= end; i++) {
                s = swap_char(s, start, i);
                permutation(s, start + 1, end);
                s= swap_char(s, start, i);

            }
        }
    }
    private static String swap_char(String s, int i, int j)
    {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s= sc.next();
        permutation(s,0,s.length()-1);
    }
}
