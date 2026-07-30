class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        find(list,l1,0,target,candidates);
        return list;
    }
    static void find(List<List<Integer>> list, List<Integer> l1,int i,int target,int nums[])
    {
        if(i == nums.length)
        {
            if(target == 0)
            {
                list.add(new ArrayList<>(l1));
                return;
            }
            return;
        }

        if(nums[i]<=target)
        {
            l1.add(nums[i]);
            find(list,l1,i,target-nums[i],nums);
            l1.remove(l1.size()-1);
        }
        find(list,l1,i+1,target,nums);
    }
}