class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            int nextGreater = -1;
            boolean found = false;
            
            for (int j = 0; j < nums2.length; j++) {
                // Find target in nums2 first
                if (nums2[j] == target) {
                    found = true;
                }
                
                // Once target is found, look for the first greater element to its right
                if (found && nums2[j] > target) {
                    nextGreater = nums2[j];
                    break; // Stop at the very first greater element
                }
            }
            
            result[i] = nextGreater;
        }
        
        return result;
    }
}