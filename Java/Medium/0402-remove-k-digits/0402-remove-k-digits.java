class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character> st = new Stack<>();

        for(int i=0; i<num.length(); i++)
        {
            while(!st.isEmpty() && k > 0 && (st.peek() - '0') >  (num.charAt(i) - '0'))
            {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }

        while(k > 0) 
        {
            st.pop();
            k--;
        }

        if(st.isEmpty()) return "0";
        
        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        sb.reverse();

        int startIndex = 0;
        while (startIndex < sb.length() && sb.charAt(startIndex) == '0')   
        {
            startIndex++;
        }

       String res = sb.substring(startIndex);

        return res.length() == 0 ? "0" : res;
        
    }
}