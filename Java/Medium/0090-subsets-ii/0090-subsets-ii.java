class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        backtrack(set, list, 0, nums.length, nums);

        return new ArrayList<>(set);
    }
    static void backtrack(HashSet<List<Integer>> set,List<Integer> list, int i, int n, int nums[])
    {
        if(i == n)
        {
            set.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        backtrack(set, list, i+1, n, nums);

        list.remove(list.size() - 1);
        backtrack(set, list, i+1, n, nums);
    }
}