package Assignment_1;

import java.util.Scanner;

public class Stock_Buy_And_Sell {
    public static int maxProfit(int[] arr)
    {
        int profit =0;
        for(int i= 1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                profit = profit+(arr[i]-arr[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Maximum Profit : " +maxProfit(arr));
    }
}
