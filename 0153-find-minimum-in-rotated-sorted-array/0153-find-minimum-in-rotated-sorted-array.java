class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int lowest = 99999;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(nums[low] <= nums[mid])
            {
                lowest = Math.min(lowest,nums[low]);
                low = mid + 1;
            }
            else
            {
                lowest = Math.min(lowest,nums[mid]);
                high = mid - 1;
            }
        }
        return lowest;
    }
}