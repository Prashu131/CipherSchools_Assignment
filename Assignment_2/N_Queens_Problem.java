package Assignment_2;

import java.util.Scanner;

public class N_Queens_Problem {
        public static boolean placeQueens(int[][] grid, int i)
        { // i =0,grid.length=4
            if( i== grid.length)
            {
                //Print the grid
                for(int row=0;row<grid.length;row++)
                {
                    for(int col =0;col<grid[0].length;col++)
                        System.out.print(grid[row][col]+ " ");
                    System.out.println();
                }
                return true;
            }
            for(int k= 0;k<grid[0].length;k++)
            {
                if(isSafeToPLace(grid, i, k))
                {
                    grid[i][k] = 1;
                    boolean isPlaced = placeQueens(grid, i+1);
                    if(isPlaced) {
                        return true;
                    }
                }
                //backtracking
                grid[i][k] =0;
            }
            return false;
        }

        private static boolean isSafeToPLace(int[][] grid, int i, int k) {
            for(int row =0; row<i; row++)
            {
                if(grid[row][k] ==1)
                    return false;
            }
            int x =i;
            int y =k;
            //left diagonal
            while(x >= 0 && y>=0)
            {
                if(grid[x][y] ==1)
                    return false;
                x--;
                y--;
            }
            x=i;
            y =k;
            //right diagonal
            while(x >= 0 && y< grid.length)
            {
                if(grid[x][y] ==1)
                    return false;
                x--;
                y++;
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[][] grid = new int[x][y];
            placeQueens(grid,0);

        }
    }
