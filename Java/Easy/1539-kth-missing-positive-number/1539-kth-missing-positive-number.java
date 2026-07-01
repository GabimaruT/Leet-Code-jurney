class Solution {
    public int findKthPositive(int[] arr, int k) {
      for (int num : arr) {
            if (num <= k) {
                k++; // Shift the target forward
            } else {
                break; // Since the array is sorted, we can stop early
            }
        }
        return k;
    }
}