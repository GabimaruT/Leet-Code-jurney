class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Set<Character> set = new HashSet<>();
        Set<Character> set1 = new HashSet<>();
        for(char c='a'; c<= 'z'; c++)
        {
            set.add(c);
        }

        for(int i=0; i<sentence.length(); i++)
        {
            set1.add(sentence.charAt(i));
        }

        return set.equals(set1);
    }
}