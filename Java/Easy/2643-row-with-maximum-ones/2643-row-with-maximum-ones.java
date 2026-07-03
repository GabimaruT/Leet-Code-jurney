class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        Map<Integer,Integer> map = new HashMap<>();
        int row = mat.length;
        int col = mat[0].length;
        int count = 0;
        int ans [] = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(mat[i][j] == 1)
                {
                    count++;
                }
            }
            map.put(i,count);
            count = 0;
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue() > ans[1])
            {
                ans[0] = e.getKey();
                ans[1] = e.getValue();
            }
        }
        return ans;
    }
}