class Solution {
    public int[] singleNumber(int[] nums) {
        
         Map<Integer,Integer> map = new HashMap<>();
         List<Integer> list = new ArrayList<>();
         

        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue() == 1)
            {
                list.add(e.getKey());
            }
        }
        int arr[] = new int[list.size()];

        for(int i=0; i<list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}