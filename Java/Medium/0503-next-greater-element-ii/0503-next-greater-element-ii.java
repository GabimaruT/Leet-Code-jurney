class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int nextGratest[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();

        for(int i=2*nums.length-1; i>=0; i--)
        {
            while(!st.isEmpty() && st.peek() <= nums[i%nums.length])
            {
                st.pop();
            }
            if(i<nums.length)
            {
                if(st.isEmpty())
                {
                    nextGratest[i] = -1;
                }
                else
                {
                    nextGratest[i] = st.peek();
                }
            }
            st.push(nums[i%nums.length]);
        }
        return nextGratest;
    }
}