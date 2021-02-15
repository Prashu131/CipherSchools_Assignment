package Assignment_1;

import java.util.Arrays;
import java.util.Scanner;

public class Alternative_sorting {
    public static void sortArray(int[] arr)
    {
        Arrays.sort(arr);
        int[] sorted = new int[arr.length];
        int low=0,high=arr.length-1,i=0;
        while(low<high)
        {
            sorted[i]=arr[high];
            i++;
            high--;
            sorted[i]=arr[low];
            i++;
            low++;
        }
        if((arr.length)%2 != 0)
            sorted[arr.length-1]=arr[high];
        for(int j: sorted) System.out.print(j+" ");

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sortArray(arr);

    }
}
