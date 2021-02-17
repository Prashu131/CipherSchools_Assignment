package Assignment_1;

public class Merge_Sort {
    public static void merge(int arr[], int beg, int mid, int end)
    {

        int l = mid - beg + 1;
        int r = end - mid;

        int Left[] = new int [l];
        int Right[] = new int [r];

        for (int i=0; i<l; ++i)
            Left[i] = arr[beg + i];

        for (int j=0; j<r; ++j)
            Right[j] = arr[mid + 1+ j];


        int i = 0, j = 0;
        int k = beg;
        while (i<l&&j<r)
        {
            if (Left[i] <= Right[j])
            {
                arr[k] = Left[i];
                i++;
            }
            else
            {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i<l)
        {
            arr[k] = Left[i];
            i++;
            k++;
        }

        while (j<r)
        {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int beg, int end)
    {
        if (beg<end)
        {
            int mid = (beg+end)/2;
            sort(arr, beg, mid);
            sort(arr , mid+1, end);
            merge(arr, beg, mid, end);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {76,1,54,36,86,45,83};
        sort(arr, 0, arr.length-1);
        System.out.println("Sorted array");
        for(int i =0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
