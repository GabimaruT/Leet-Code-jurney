class Solution {
    public int trap(int[] nums) {
        
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        int l = 0;
        int r = nums.length-1;

        while(l < r)
        {
            if(nums[l] <= nums[r])
            {
                if(leftMax > nums[l])
                {
                    total += leftMax - nums[l];
                }
                else
                {
                    leftMax = nums[l];
                }
                l++;
            }
            else
            {
                if(rightMax > nums[r])
                {
                    total += rightMax - nums[r];
                }
                else
                {
                    rightMax = nums[r];
                }
                r--;
            }
        }
        return total;
    }
}