class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = -1;
        
        if(nums.length == 1)
        {
            return nums[0];
        }

        if(nums.length == 0)
        {
            return -1;
        }

        for(int i=1; i<nums.length-2; i++)
        {
          if(nums[i] != nums[i+1] && nums[i] != nums[i-1])
          {
            ans = nums[i];
          }
        }
       
       if(ans == -1)
       {
        if(nums[0] != nums[1])
        {
            return nums[0];
        }
        else
        {
            return nums[nums.length-1];
        }
       }

       else
       {
        return ans;
       }
    }
}