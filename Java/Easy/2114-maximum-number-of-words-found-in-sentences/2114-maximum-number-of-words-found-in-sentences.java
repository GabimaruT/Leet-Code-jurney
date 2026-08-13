class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int count = 0;

        for(String s : sentences)
        {
            count = Math.max(count,maxCount(s));
        }
        return count;
    }

    static int maxCount(String s)
    {
        int counter = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            {
                counter++;
            }
        }
        return counter + 1;
    }
}