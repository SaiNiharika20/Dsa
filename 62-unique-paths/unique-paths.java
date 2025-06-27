import java.util.Arrays;

class Solution {

    // ✅ Recursive function to count paths from (i, j) to (m, n)
    public int findPaths(int i, int j, int m, int n, int[][] arr) {
        // Base case: reached destination
        if (i == m && j == n) {
            return 1;
        }

        // Out of bounds
        if (i > m || j > n) {
            return 0;
        }

        // Memoization check
        if (arr[i][j] != -1) {
            return arr[i][j];
        }

        // Recursive case: move down and right
        arr[i][j] = findPaths(i + 1, j, m, n, arr) + findPaths(i, j + 1, m, n, arr);
        return arr[i][j];
    }

    // ✅ Main function to initialize DP array and call recursive function
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];

        // Initialize all values to -1
        for (int i = 0; i < m; i++) {
            Arrays.fill(arr[i], -1);
        }

        // Start from top-left (0, 0) and go to bottom-right (m-1, n-1)
        return findPaths(0, 0, m - 1, n - 1, arr);
    }
}
