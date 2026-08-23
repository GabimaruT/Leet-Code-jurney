class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {

        List<List<Integer>> list = new ArrayList<>();

        Set<Integer> unique = new HashSet<>();
        for(int num : nums)
            {
                if(num >= lower && num <= upper)
                {
                    unique.add(num);
                }
            }
        List<Integer> l1 = new ArrayList<>(unique);
        Collections.sort(l1);

        long curr = lower;

        for(int num : l1)
            {
                if(num > curr)
                {
                    list.add(Arrays.asList((int) curr, num-1));
                }
                curr = (long) num + 1;
            }

        if(curr <= upper)
        {
            list.add(Arrays.asList((int) curr, upper));
        }
        return list;
        
        
    }
}