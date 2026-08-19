class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();

        backtack(0, nums, list, l1);
        return list;
    }

    static void backtack(int idx, int nums[], List<List<Integer>> list, List<Integer> l1)
    {
        list.add(new ArrayList<>(l1));
        for(int i=idx; i< nums.length; i++)
        {
            if(i != idx && nums[i] == nums[i-1]) continue;
            l1.add(nums[i]);
            backtack(i+1, nums, list, l1);
            l1.remove(l1.size() - 1);
        }
    }
}