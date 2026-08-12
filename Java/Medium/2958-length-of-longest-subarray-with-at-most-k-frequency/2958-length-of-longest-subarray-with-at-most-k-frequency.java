class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        if(nums.length == k) return k;
        int len = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int j = 0;

        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            while(map.get(nums[i]) > k)
            {
                map.put(nums[j], map.get(nums[j]) - 1);
                j++;
            }
            len = Math.max(len, i - j + 1);
        }
        return len;

    }
}