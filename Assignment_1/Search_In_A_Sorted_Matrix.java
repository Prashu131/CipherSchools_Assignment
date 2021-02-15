package Assignment_1;

public class Search_In_A_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] mat ={ {10, 20, 30, 40}, {15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};
        int key = 29;
        int j = -1;
        int k = -1;
        //Search element is in between the row
        for(int i=0;i<4;i++)
        {
            if(mat[i][0]<= key && mat[i][3]>= key)
                j=i;
        }
        //Search the element
        for(int i=0;i<4;i++)
        {
            if(mat[j][i]==key) {
                k =i;
                break;
            }
        }
        if(k!= -1)
            System.out.println("Element is at " + j + ","+k);
        else
            System.out.println("Element not found");
    }
}
