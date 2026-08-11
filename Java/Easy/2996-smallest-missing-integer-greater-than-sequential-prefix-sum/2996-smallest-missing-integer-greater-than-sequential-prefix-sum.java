class Solution {
    public int missingInteger(int[] nums) {
        
        if(nums.length == 1) return nums[0] + 1;
        int prefix = 0;
        int counter = 0;

        for(int i=1; i<nums.length; i++)
        {
            counter++;
            if(nums[i] == nums[i - 1] + 1)
            {
                prefix += nums[i - 1];
            }
            else
            {
                prefix += nums[i - 1];
                break;
            }
        }

        if(counter == nums.length - 1) 
        {
           if(nums[nums.length - 2] == nums[nums.length - 1] - 1)
           {
                 prefix += nums[nums.length - 1];
           }
        }

         Arrays.sort(nums);

        for(int i=0; i<nums.length; i++)
        {
            if(prefix == nums[i])
            {
                prefix++;
            }
        }
        return prefix;

    }
}