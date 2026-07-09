class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Integer> charIdxS = new HashMap<>();
        Map<Character,Integer> charIdxT = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            if(!charIdxS.containsKey(s.charAt(i)))
            {
                charIdxS.put(s.charAt(i),i);
            }

            if(!charIdxT.containsKey(t.charAt(i)))
            {
                charIdxT.put(t.charAt(i),i);
            }

            if(!charIdxS.get(s.charAt(i)).equals(charIdxT.get(t.charAt(i))))
            {
                return false;
            }
        }
        return true;
    }
}