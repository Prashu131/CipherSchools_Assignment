package Assignment_1;
import java.util.Scanner;
public class Find_Majority_Element {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int count =0;
        int major =0;
        int index =-1;
        //finds the element with highest number of occurances
        for(int i=0 ;i < n ; i++ )
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                    count++;
            }
            if(count>major)
            {
                major = count;
                index = i;
            }
        }
        //find the majority element
        if(major >= n/2)
            System.out.println("Majority Element is : "+ arr[index]);
        else
            System.out.println("No majority element exists");
        }
    }

