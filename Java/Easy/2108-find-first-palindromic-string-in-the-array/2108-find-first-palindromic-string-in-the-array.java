class Solution {
    public String firstPalindrome(String[] words) {

        for(String word : words)
        {
            if(isPalendrom(word))
            {
                return word;
            }
        }
        return "";
    }

    static boolean isPalendrom(String s)
    {
        int i = 0;
        int j = s.length() - 1;

        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j)) 
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}