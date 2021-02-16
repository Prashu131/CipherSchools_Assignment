package Assignment_1;

import java.util.Scanner;

class Merge_Two_Sorted_Array{
    public static void mergeArrays(int[] arr1, int[] arr2, int n1,
                                   int n2, int[] arr3)
    {
        int i = 0, j = 0, k = 0;
        while (i<n1 && j <n2)
        {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < n1)
            arr3[k++] = arr1[i++];
        while (j < n2)
            arr3[k++] = arr2[j++];
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 =new int[n1];
        for(int i=0;i<n1;i++)
            arr1[i]=sc.nextInt();
        int n2 =sc.nextInt();
        int[] arr2= new int[n2];
        for(int i=0;i<n2;i++)
            arr2[i]=sc.nextInt();
        int[] arr3= new int[n1+n2];
        mergeArrays(arr1,arr2,n1,n2,arr3);
        for(int j=0;j<arr3.length;j++)System.out.print(arr3[j]+" ");
        }
}
