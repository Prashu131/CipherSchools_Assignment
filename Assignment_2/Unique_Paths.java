package Assignment_2;

import java.util.Scanner;
import java.util.Stack;

public class Unique_Paths {
    static int count =0;
    public static void generatePaths(int[][] matrix, int i, int j, Stack<Integer> path) {


        int m = matrix.length;
        int n = matrix[0].length;
        if ((i == m - 1) && (j == n - 1)) {
            path.add(matrix[i][j]);
            count++;
            path.pop();
        }
        path.add(matrix[i][j]);
        if (j + 1 >= 0 && j + 1 < n) {
            generatePaths(matrix, i, j + 1, path);
        }
        if (i + 1 >= 0 && i + 1 < m) {
            generatePaths(matrix, i + 1, j, path);
        }
        path.pop();
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] matrix = new int[x][y];
        Stack<Integer> s = new Stack<>();
        generatePaths(matrix, 0, 0, s);
        System.out.println("The Possible Number Of Paths are : "+count);
    }
}
