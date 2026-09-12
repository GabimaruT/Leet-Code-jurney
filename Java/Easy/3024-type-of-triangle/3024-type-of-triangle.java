class Solution {
    public String triangleType(int[] nums) {

        if(nums[0] + nums[1] <= nums[2]) return "none";
        
        else if(nums[1]+nums[2] <= nums[0]) return "none";

        else if(nums[0] + nums[2] <= nums[1]) return "none";
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }

        if(map.size() == 3)
        {
            return "scalene";
        }
        else if(map.size()==1)
        {
            return "equilateral";
        }
        else
        {
            return "isosceles";
        }
    }
}