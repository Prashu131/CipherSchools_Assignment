package Assignment_1;

public class Segregate_zero_one {
    public static void segregate (int[] arr)
    {
        int left =0, right = arr.length-1;
        while(left<right)
        {
            if(arr[left]==1)
            {
                int temp =arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                right--;
            }
            else
            left++;
        }
        for (int j : arr) System.out.print(j + " ");
    }
    public static void main(String[] args) {
        int[] arr={ 0,1,0,1,1,1};
        segregate(arr);
    }
}
