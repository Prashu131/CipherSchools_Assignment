package Assignment_1;

public class The_First_and_Last_Occurances_In_A_Sorted_Array {
    public static void occurances (int[] arr,int x)
    {
        int n= arr.length-1;
        int low=0,high = n;
        while(low<=high)
        {
            int mid = (high+low)/2;
            if(arr[mid]<x)
                low = mid+1;
            else if (arr[mid]>x)
                high = mid-1;
            else {
                if (mid != 0 && arr[mid] != arr[mid - 1])
                {   System.out.println("First Occurance : " + mid);
                    break;}
                else
                    high = mid- 1;
            }
        }
        low =0;
        high=n;
        while(low<=high)
        {
            int mid = (high+low)/2;
            if(arr[mid]<x)
                low = mid+1;
            else if (arr[mid]>x)
                high = mid-1;
            else {
                if (mid != n && arr[mid] != arr[mid + 1])
                {   System.out.println("Last Occurance : " + mid);
                break;}
                else
                    low = mid+ 1;
            }
        }


    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,4,4,4,4,4,5,6,7};
        occurances(arr,4);

    }
}
