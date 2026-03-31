class Solution {

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int stCol = 0;
            int endCol = n - 1;

            while (stCol < endCol) {
                int temp = matrix[i][stCol];
                matrix[i][stCol] = matrix[i][endCol];
                matrix[i][endCol] = temp;

                stCol++;
                endCol--;
            }
        }
    }
}
