class Solution {
    public long weightedSum(int[] parent, int[] nums) {

        int n = parent.length;
        if(n == 0) return 0;

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<n; i++)
            {
                list.add(new ArrayList<>());
            }

        int root = 0;
        for(int i=0; i< n; i++)
            {
                int p = parent[i];
                if(p != -1)
                {
                    list.get(p).add(i);
                }
                else
                {
                    root = i;
                }
            }

        int dept[] = new int[n];
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{root,1});
        int h = 1;

        while(!q.isEmpty())
            {
                int curr[] = q.poll();
                int node = curr[0];
                int d = curr[1];

                dept[node] = d;
                h = Math.max(h,d);

                for(int neighbor : list.get(node))
                    {
                        q.offer(new int[]{neighbor,d+1});
                    }
            }

        long totalSum = 0;

        for(int i=0; i<n; i++)
            {
            int d = dept[i];
            long w =(long) nums[i] * (h- d + +1);
            totalSum += w;
            }

        return totalSum;
    }
}