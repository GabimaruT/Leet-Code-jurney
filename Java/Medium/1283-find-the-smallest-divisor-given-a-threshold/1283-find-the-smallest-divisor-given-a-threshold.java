class Solution {
    public int smallestDivisor(int[] nums, int threshold) { 

        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = high;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(isPosible(nums,threshold,mid) == true)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }
    static boolean isPosible(int nums[], int threshold, int div)
    {
        int ans = 0;
        for(int i=0; i<nums.length; i++)
        {
            ans += Math.ceilDiv(nums[i],div);
        }
        if(ans <= threshold)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}