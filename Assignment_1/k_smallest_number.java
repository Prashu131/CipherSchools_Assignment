package Assignment_1;

import java.util.Arrays;
import java.util.Scanner;

public class k_smallest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k=sc.nextInt();
        Arrays.sort(arr);
        for(int i =0;i<k;i++)
            System.out.print(arr[i]+" ");
    }
}
