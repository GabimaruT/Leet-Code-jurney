class Solution {
    public int maxProduct(int n) {
        
        String s = Integer.toString(n);
        int arr[] = new int[s.length()];
        int i = 0;
        int temp = n;

        while(temp != 0)
        {
            if(i > arr.length) break;
            arr[i] = temp % 10;
            temp /= 10;
            i++;
        }

        Arrays.sort(arr);
        return arr[arr.length - 1] * arr[arr.length - 2];
    }
}