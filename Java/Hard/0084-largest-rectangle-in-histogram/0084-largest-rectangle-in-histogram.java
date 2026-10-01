class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int nse[] = findNse(heights);
        int pse[] = findPse(heights);
        int maxArea = 0;

        for(int i = 0; i < heights.length; i++)
        {
            int area = heights[i] * (nse[i] - pse[i] - 1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
    static int[] findNse(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--)
        {
            while(!st.isEmpty() && arr[i] <= arr[st.peek()])
            {
                st.pop();
            }
            ans[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return ans;
    }

    static int[] findPse(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            while(!st.isEmpty() && arr[i] < arr[st.peek()])
            {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }

}