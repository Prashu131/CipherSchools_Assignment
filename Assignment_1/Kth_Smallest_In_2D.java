package Assignment_1;

public class Kth_Smallest_In_2D {
            public static int kSmallest(int [][] matrix, int k) {
                int cols = matrix[0].length;
                int rows = matrix.length;

                int low = matrix[0][0];
                int high = matrix[rows - 1][cols - 1];

                while(low < high) {
                    int  mid = (low + high) / 2;
                    int count = getCountSmallerEquals(matrix, mid);

                    if(count >= k) {
                        high = mid;
                    } else {
                        low = mid+1;
                    }
                }
                return  low;
            }
            private static int getCountSmallerEquals(int [][] matrix, int target)  {

                int cols = matrix[0].length;
                int rows = matrix.length;
                int count = 0;

                int row = rows -1;
                int col = 0;

                while(row >= 0 && col < cols) {

                    if(matrix[row][col] <= target) {
                        col++;
                        count = count + (row + 1);
                    } else {
                        row--;
                    }
                }
                return count;
            }

            public static void main(String[] args) {

                int[][] mat ={ {10, 20, 30, 40}, {15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};
                for(int i=0;i<4;i++)
                {
                    for(int j=0;j<4;j++)
                        System.out.print(mat[i][j]+" ");
                    System.out.println();
                }
                System.out.println(kSmallest(mat, 6));
            }
        }
