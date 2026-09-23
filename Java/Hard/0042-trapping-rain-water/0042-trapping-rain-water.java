class Solution {
    public int trap(int[] height) {
        
        int totalWater = 0;
        int prefixMax[] = findPrefixMax(height);
        int sufixMax[] = findSufixMax(height);

        for(int i=0; i<height.length; i++)
        {
            if(height[i] < prefixMax[i] && height[i] < sufixMax[i])
            {
                totalWater += Math.min(prefixMax[i],sufixMax[i]) - height[i];
            }
        }

        return totalWater;

    }

    static int[] findPrefixMax(int [] height)
    {
        int prefixMax[] = new int[height.length];
        prefixMax[0] = height[0];

        for(int i=1; i<height.length; i++)
        {
            prefixMax[i] = Math.max(prefixMax[i-1], height[i]);
        }

        return prefixMax;
    }

    static int[] findSufixMax(int[] height)
    {
        int sufixMax[] = new int[height.length];
        sufixMax[height.length-1] = height[height.length-1];

        for(int i=height.length-2; i>=0; i--)
        {
            sufixMax[i] = Math.max(sufixMax[i+1],height[i]);
        }

        return sufixMax;
    }
}