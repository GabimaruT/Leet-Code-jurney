class Solution {
    public int maximumLengthSubstring(String s) {
        
        int res = 0;
        int j = 0;
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr,0) + 1);

            while(map.get(curr) > 2)
            {
                char left = s.charAt(j);
                map.put(left, map.get(left) - 1);
                j++;
            }
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}