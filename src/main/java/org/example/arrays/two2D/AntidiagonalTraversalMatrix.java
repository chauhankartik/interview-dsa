package org.example.arrays.two2D;

public class AntidiagonalTraversalMatrix {
}

class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        int n = matrix.length;
        int[] res = new int[n*n];
        int idx = 0;

        for(int j = 0; j < n; j++) {
            int row = 0;
            int col = j;

            while (row < n && col >= 0) {
                res[idx++] = matrix[row][col];
                row++;
                col--;
            }
        }

        for(int i = 1; i < n; i++) {
            int row = i, col = n - 1;
            while(row < n && col >= 0) {
                res[idx++] = matrix[row][col];
                row++;
                col--;
            }
        }

        return res;
    }
}