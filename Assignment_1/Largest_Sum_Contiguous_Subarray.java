package Assignment_1;

import java.util.Scanner;

public class Largest_Sum_Contiguous_Subarray {
    public static int sum(int[] arr)
    {
        int maxEnding = arr[0];
        int result = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            maxEnding= Math.max(maxEnding+arr[i],arr[i]);
            result = Math.max(maxEnding,result);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Maximum Contiguous Sum : "+sum(arr));
    }
}
