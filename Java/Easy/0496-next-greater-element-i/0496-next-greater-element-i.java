class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st = new Stack<>();
        int nextGratest[] = new int[10001];

        for(int j=nums2.length-1; j>=0; j--)
        {
            while(!st.isEmpty() && st.peek() <=nums2[j])
            {
                st.pop();
            }

            nextGratest[nums2[j]] = st.isEmpty() ? -1 : st.peek();
            st.push(nums2[j]);
        }

        for(int i=0; i<nums1.length; i++)
        {
            nums1[i] = nextGratest[nums1[i]];
        }
        return nums1;
    }
}