import java.util.Stack;

class Solution {
    public long subArrayRanges(int[] nums) {
        return sumSubarrayMax(nums) - sumSubarrayMins(nums);
    }
    
    public long sumSubarrayMins(int[] arr) {
        int nse[] = findNse(arr);
        int pse[] = findPse(arr);
        long total = 0;

        for(int i = 0; i < arr.length; i++) {
            long left = i - pse[i]; 
            long right = nse[i] - i; 
            
            long ways = left * right;
            long contribution = ways * arr[i];
            
            total += contribution; // No modulo here
        }
        return total;
    }

    public long sumSubarrayMax(int[] arr) {
        int nge[] = findNge(arr);
        int pge[] = findPge(arr);
        long total = 0;

        for(int i = 0; i < arr.length; i++) {
            long left = i - pge[i]; 
            long right = nge[i] - i; 
            
            long ways = left * right;
            long contribution = ways * arr[i];
            
            total += contribution; // No modulo here
        }
        return total;
    }

    static int[] findNse(int[] arr) {
        int nse[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return nse;
    }

    static int[] findPse(int[] arr) {
        int pse[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }

    static int[] findNge(int[] nums) {
        int nge[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();

        for(int i = nums.length - 1; i >= 0; i--) {
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? nums.length : st.peek();
            st.push(i);
        }
        return nge;
    }

    static int[] findPge(int[] arr) {
        int pge[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pge;
    }
}