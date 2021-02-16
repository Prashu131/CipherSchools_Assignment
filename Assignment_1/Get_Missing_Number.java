package Assignment_1;

import java.util.Scanner;

public class Get_Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int x1= arr[0];
        int x2= 1;
        for(int i=1;i<n;i++)
            x1=x1^arr[i];
        for(int i=2;i<=n+1;i++)
            x2 = x2^i;
        System.out.println("The Missing Number is : "+ (int)(x1^x2));
    }
}
