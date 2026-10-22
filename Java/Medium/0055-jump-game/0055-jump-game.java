class Solution {
    public boolean canJump(int[] nums) {
        
        if(nums.length < 2) return true;
        int maxIdx = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(i > maxIdx) return false;
            maxIdx = Math.max(maxIdx,(i + nums[i]));
        }

        if(maxIdx >= nums.length-1)
        {
            return true;
        }
        return false;
    }
}