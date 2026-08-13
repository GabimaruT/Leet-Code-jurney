class Solution {
    public int[] numberGame(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[nums.length];
        int a = 0;
        int b = 0;
        Arrays.sort(nums);

        for(int i=0,j=1; j<=nums.length-1;i+=2,j+=2)
        {
            a = nums[i];
            b = nums[j];
            list.add(b);
            list.add(a);
        }

        for(int i=0; i< nums.length; i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
     
    }
}