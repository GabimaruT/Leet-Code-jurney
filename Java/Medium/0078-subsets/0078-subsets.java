class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();

        find(list, l1, 0, nums.length, nums);
        return list;
    }

    static void find(List<List<Integer>> list, List<Integer> l1, int i, int n,int nums[])
    {
        if(i == n)
        {
            list.add(new ArrayList<>(l1));
            return;
        }

        l1.add(nums[i]);
        find(list ,l1, i+1, n, nums);

        l1.remove(l1.size() - 1);
        find(list, l1, i+1, n, nums);
    }
}