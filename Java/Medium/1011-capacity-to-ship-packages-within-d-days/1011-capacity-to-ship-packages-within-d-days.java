class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = findMax(weights);
        int high = findSum(weights);

        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            
            int noOfDays = returnDays(weights,mid);

            if(noOfDays <= days)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }

        }
        return low;
    }
    static int returnDays(int weights[], int cap)
    {
        int day = 1;
        int load = 0;

        for(int i=0; i<weights.length; i++)
        {
            if((load + weights[i]) > cap)
            {
                day += 1;
                load = weights[i];
            }
            else
            {
                load += weights[i];
            }
        }
        return day;
    }

    static int findMax(int weights[])
    {
        int max = weights[0];
        for(int i=0; i<weights.length; i++)
        {
            if(weights[i] > max)
            {
                max = weights[i];
            }
        }
        return max;
    }
    static int findSum(int weights[])
    {
        int sum = 0;
        for(int i=0; i<weights.length; i++)
        {
            sum = sum + weights[i];
        }
        return sum;
    }
}