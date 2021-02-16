package Assignment_1;

public class Spiral_Form_Matrix {
    public static void spiral(int[][] arr,int row,int col)
    {
        int top = 0,left =0,bottom= row-1,right = col-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
                System.out.print(arr[top][i]+ " ");
            top++;
            for(int i= top;i<=bottom;i++)
                System.out.print(arr[i][right]+" ");
            right--;
            if(top<=bottom){
            for(int i= right;i>=left;i--)
                System.out.print(arr[bottom][i]+" ");
            bottom--;}
            if(left<=right){
            for(int i=bottom;i>=top;i--)
                System.out.print(arr[top][i]+" ");
            left++;}
        }
    }

    public static void main(String[] args) {
        int[][] mat ={ {10, 20, 30, 40}, {15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
        spiral(mat,4,4);
    }
}
