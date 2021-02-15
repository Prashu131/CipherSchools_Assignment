package Assignment_1;

import java.util.Scanner;

public class Trap_Rain_Water {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int[] left =new int[arr.length];
        int[] right = new int [arr.length];
        left[0]= arr[0];
        right[arr.length-1] = arr[arr.length-1];
        for( int i=1;i<arr.length;i++)
        {
            left[i] = Math.max(left[i-1],arr[i]);
        }
        for( int i=arr.length-2;i>=0;i--)
        {
            right[i] = Math.max(right[i+1],arr[i]);
        }
        int totalwater = 0;
        for(int i=0;i<arr.length;i++)
        {
            totalwater += Math.min(left[i],right[i])-arr[i];}
        System.out.println("Total Amount of Water Trapped : "+ totalwater);
    }
    }

