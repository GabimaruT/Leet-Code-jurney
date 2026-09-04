class Solution {
    public int[] singleNumber(int[] nums) {
        
        int xor = 0;
        int res[] = new int[2];

        for(int i=0; i<nums.length; i++)
        {
            xor = xor^nums[i];
        }
        int rightMost = xor & -xor; 

        int b1 = 0;
        int b2 = 0; 

        for(int i=0; i<nums.length; i++)
        {
            if((nums[i] & rightMost) != 0)
            {
                b1 = b1^nums[i];
            }
            else
            {
                b2 = b2^nums[i];
            }
        }

        res[0] = b1;
        res[1] = b2;

        return res;
    }
}