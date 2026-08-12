class Solution {
    public boolean isPowerOfFour(int n) {
        
        if(n < 1) return false;

        else
        {
            return Math.log(n) / Math.log(4) % 1 == 0;
        }
    }
}