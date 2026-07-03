class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        int max_count = -1;
        int index = -1;

        // Linear scan: check every single element row by row
        for (int i = 0; i < row; i++) {
            int current_ones = 0;
            
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    current_ones++;
                }
            }

            // Update if we find a row with MORE ones
            if (current_ones > max_count) {
                index = i;
                max_count = current_ones;
            }
        }
        
        return new int[]{index, max_count};
    }
}