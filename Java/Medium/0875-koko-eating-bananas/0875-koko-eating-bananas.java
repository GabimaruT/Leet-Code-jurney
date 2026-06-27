class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = findMax(piles);
        int low = 0;
        int ans = findMax(piles);

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            int rq = RequiredTime(piles,mid);

            if(rq <= h)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;;
            }
        }
        return ans;
    }

    static int RequiredTime(int piles[],int hour)
    {
        int totalh = 0;

        for(int i=0; i<piles.length; i++)
        {
            totalh += (double)(piles[i] + hour - 1) / hour;
        }
        return totalh;
    }
    static int findMax(int nums[])
    {
       int max = nums[0];

       for(int num : nums)
       {
            if(num > max)
            {
                max = num;
            }
       }
        return max;
    }
}