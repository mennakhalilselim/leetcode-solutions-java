/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstColumn = false;
        int rows = matrix.length;
        int columns = matrix[0].length;

        for(int i = 0; i < rows; i++){ 
            if(matrix[i][0] == 0){
                firstColumn = true;
            }

            for(int j = 1; j < columns; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < rows; i++){
            for(int j = 1; j < columns; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j = 0; j < columns; j++){
                matrix[0][j] = 0;
            }
        }

        if(firstColumn){
            for(int i = 0; i < rows; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
// @lc code=end
// time O(m*n)
// space O(1)
