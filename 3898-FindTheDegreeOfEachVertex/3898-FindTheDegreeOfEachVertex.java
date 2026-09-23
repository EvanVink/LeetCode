// Last updated: 9/23/2026, 9:23:41 AM
class Solution {
    public int[] findDegrees(int[][] matrix) {
         int length = matrix.length;

        int[] sums = new int[length];

        
        for (int i = 0; i < length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                sums[i] += matrix[i][j];
            }
        }





        return sums;
    }
}