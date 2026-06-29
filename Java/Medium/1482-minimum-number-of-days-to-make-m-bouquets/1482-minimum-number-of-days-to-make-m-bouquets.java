class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((m*k) > bloomDay.length) return -1;

        int min = Arrays.stream(bloomDay).min().getAsInt();
        int max =  Arrays.stream(bloomDay).max().getAsInt();
        
        int low = min;
        int high = max;
        int ans = -1;

        while(low <= high)
        {
            int mid = (low + high)/2;

            if(IsPosible(bloomDay, mid, m, k) == true)
            {
                ans = mid;
                high = mid - 1; 
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }
    static boolean IsPosible(int bloomDay[], int day, int m, int k)
    {
        int count = 0;
        int number = 0;

        for(int i=0; i<bloomDay.length; i++)
        {
            if(bloomDay[i] <= day)
            {
                count++;
            }
            else
            {
                number += count/k;
                count = 0;
            }
        }
        number += count/k;
        if(number >= m)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}