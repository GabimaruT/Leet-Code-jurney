class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++)
        {
            int temp[] = seperat(nums[i]);

            for(int j=0; j<temp.length; j++)
            {
                list.add(temp[j]);
            }
        }
        
        int ans[] = new int[list.size()];

        for(int i=0; i<list.size(); i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
    }
    
    static int[] seperat(int num)
    {
        String str = Integer.toString(num);
        int arr[] = new int[str.length()];

        for(int i=0; i<str.length(); i++)
        {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        return arr;
    }
}