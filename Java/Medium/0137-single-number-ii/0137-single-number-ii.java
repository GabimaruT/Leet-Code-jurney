class Solution {
    public int singleNumber(int[] nums) {
        
        int ones = 0;
        int tows = 0;

        for(int i=0; i<nums.length; i++)
        {
            ones = (ones ^ nums[i]) & ~tows;
            tows = (tows ^ nums[i]) & ~ones;
        }
        return ones;
    }
}