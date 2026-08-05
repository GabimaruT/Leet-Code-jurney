class Solution {
    public int climbStairs(int n) {

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return soln(dp, n);
    }
    static int soln(int dp[],int n)
    {
        if(n == 0 || n == 1) return 1;

        if(dp[n] != -1) return dp[n];

        return dp[n] = soln(dp, n - 1) + soln(dp, n - 2);
    }
}