package Assignment_1;

public class Binary_Search {
    public static boolean search(int [] arr, int key)
    {
        int low=0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==key)
                return true;
            else if(arr[mid]>key)
                low=mid+1;
            else if (arr[mid]<key)
                 high =mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {17,13,42,65,76,89,45};
        System.out.println(search(arr,65));
    }
}
