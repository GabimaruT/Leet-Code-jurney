class Solution {
    public int[] sortArray(int[] nums) {
        
        int low = 0;
        int high = nums.length - 1;
        divide(nums,low,high);
        return nums;
    }

    static void divide(int arr[], int low, int high)
    {
        if(low >= high) return;

        int mid = low + (high - low) / 2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        conqure(arr, low, mid, high);
    }

    static void conqure(int arr[], int low, int mid, int high)
    {
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high)
        {
            if(arr[left] < arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid)
        {
            temp.add(arr[left]);
            left++;
        }

        while(right <= high)
        {
            temp.add(arr[right]);
            right++;
        }

        for(int i=low; i<=high; i++)
        {
            arr[i] = temp.get(i - low);
        }
    }
}