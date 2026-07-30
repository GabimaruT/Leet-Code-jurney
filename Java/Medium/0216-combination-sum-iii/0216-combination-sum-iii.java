class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        int arr[] = new int[9];
        for(int i=1; i<10; i++)
        {
            arr[i-1] = i;
        }
        find(list, l1, arr, k, n, 0);
        return list;
    }
    static void find(List<List<Integer>> list, List<Integer> l1, int arr[], int k, int target,int i)
    {
        if (l1.size() == k)
        {
            if(target == 0)
            {
                list.add(new ArrayList<>(l1));
                return;
            }
            return;
        }

        if (i >= arr.length) return;

        if(arr[i] <= target)
        {
            l1.add(arr[i]);
            find(list, l1, arr, k, target-arr[i], i+1);
            l1.remove(l1.size()-1);
        }
        find(list, l1, arr, k, target, i+1);
    }
}