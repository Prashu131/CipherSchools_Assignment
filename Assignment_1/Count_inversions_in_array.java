package Assignment_1;

import java.util.Scanner;

public class Count_inversions_in_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
                if(arr[i]>arr[j])
                    c++;
        }
        System.out.println("Number of Inversions : "+c);
    }
}
