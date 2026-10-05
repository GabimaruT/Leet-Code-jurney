class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        List<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0; i<nums.length; i++)
        {
            if(!dq.isEmpty() && dq.peekFirst() <= i-k)
            {
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])
            {
                dq.pollLast();
            }

            dq.add(i);
            if(i >= k-1)
            {
                list.add(nums[dq.getFirst()]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}