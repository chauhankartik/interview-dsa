package org.example.arrays.two2D;

/*
*
* https://leetcode.com/problems/01-matrix/
*
* */

import java.util.LinkedList;
import java.util.Queue;

public class Matrix542 {

}

class Solution {
    int m, n;
    int[][] move = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] res = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    res[i][j] = 0;
                    queue.offer(new int[]{i, j});
                } else {
                    res[i][j] = -1;
                }
            }
        }



        return null;
    }
}