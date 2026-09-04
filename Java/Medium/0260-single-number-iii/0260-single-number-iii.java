class Solution {
    public int[] singleNumber(int[] nums) {
        
        int res[] = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if((nums[i]^nums[j]) == 0)
                {
                    nums[i] = 0;
                    nums[j] = 0;
                }
            }
        }

        for(int i=0,j=0; i<nums.length; i++)
        {
            if(nums[i] != 0 )
            {
                res[j] = nums[i];
                j++;
            }
        }
        return res;
    }
}