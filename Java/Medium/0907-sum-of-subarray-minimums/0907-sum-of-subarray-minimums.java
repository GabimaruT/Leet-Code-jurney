class Solution {
    public int sumSubarrayMins(int[] arr) {
        
        int nse[] = findNse(arr);
        int pse[] = findPse(arr);
        long total = 0;
        int mod = (int)(1e9 + 7);

        for(int i=0; i<arr.length; i++)
        {
            long left = i - pse[i]; 
            long right = nse[i] - i; 
            
            long ways = (left * right) % mod;
            long contribution = (ways * arr[i]) % mod;
            
            total = (total + contribution) % mod; 
        }
        return (int) total;
    }

    static int[] findNse(int[] arr)
    {
        int nse[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i=arr.length-1; i>=0; i--)
        {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
            {
                st.pop();
            }
            nse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }

        return nse;
    }

    static int[] findPse(int[] arr)
    {
        int pse[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

         for(int i=0; i<arr.length; i++)
        {
            while(!st.isEmpty() && arr[st.peek()] > arr[i])
            {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return pse;
    }
}