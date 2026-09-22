class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        if(nums.length == 1) return new int[]{-1};
        
        int nextGratest[] = new int[nums.length];

        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<i+nums.length; j++)
            {
                int idx = j % nums.length;

                if(nums[idx] > nums[i])
                {
                    nextGratest[i] = nums[idx];
                    break;
                }
                else
                {
                    nextGratest[i] = -1;
                }
            }
        }
        return nextGratest;
    }
}