class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int prefixSum[][] = new int [n][m];
        int maxArea = 0;

        for(int j = 0; j < m; j++)
        {
            int sum = 0;
            for(int i = 0; i < n; i++)
            {
                if(matrix[i][j] == '1')
                {
                    sum += 1;
                }
                if(matrix[i][j] == '0')
                {
                    sum = 0;
                }
                prefixSum[i][j] = sum;
            }
        }

        for(int i = 0; i < n; i++)
        {
            maxArea = Math.max(maxArea, largestRectangleArea(prefixSum[i]));
        }
        return maxArea;
    }
    public int largestRectangleArea(int[] heights)
    {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for(int i = 0; i < heights.length; i++)
        {
            while(!st.isEmpty() && heights[st.peek()] > heights[i])
            {
                int element = st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea,heights[element] * (nse - pse - 1));
            }
            st.push(i);
        }

        while(!st.isEmpty())
        {
            int element = st.pop();
            int nse = heights.length;
            int pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea,heights[element] * (nse - pse - 1));
        }

        return maxArea;
    }
}