class Solution {
    public int differenceOfSum(int[] nums) {
        
        int element_sum = 0;
        int digit_sum = 0;

        for(int i=0; i<nums.length; i++)
        {
            element_sum += nums[i];
        }

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] >= 10)
            {
                digit_sum += graterThanTen(nums[i]);
            }
            else
            {
                digit_sum += nums[i];
            }
        }
        return element_sum - digit_sum;
    }

    static int graterThanTen(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}