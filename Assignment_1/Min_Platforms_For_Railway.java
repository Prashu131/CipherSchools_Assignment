package Assignment_1;

import java.util.Scanner;

public class Min_Platforms_For_Railway {
    public static int pltfrm(int[] arr, int[] dep, int n)
    {
        int k = 1;// 1 platform will be there
        int result =1;
        for(int i =0;i<n;i++)
        {
            k=1;
            for(int j=i+1;j<n;j++)
            {
                if ((arr[i] >= arr[j] && arr[i] <= dep[j])
                        || (arr[j] >= arr[i]
                        && arr[j] <= dep[i]))
                k++;
            }
            result = Math.max(k,result);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        int[] dep =new int[n];
        System.out.println("Enter the arrival time");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the departure time");
        for(int i=0;i<n;i++)
            dep [i]=sc.nextInt();
        System.out.println("Minimum number of platforms needed : "+pltfrm(arr,dep,n));
    }
}
