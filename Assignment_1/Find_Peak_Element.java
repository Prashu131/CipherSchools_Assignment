package Assignment_1;
import java.util.Scanner;
public class Find_Peak_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Peak Elements are");
        if(n==1)
            System.out.println(arr[0]);
        if(arr[1]<arr[0])
            System.out.println(arr[0]);
        if(arr[n-1]>arr[n-2])
            System.out.println(arr[n-1]);
        for(int i =1;i<n-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
                System.out.println(arr[i]);
        }
    }
}
