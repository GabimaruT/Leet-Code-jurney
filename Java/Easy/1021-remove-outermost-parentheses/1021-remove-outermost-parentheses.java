class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        {
            char curr = s.charAt(i);

            if(curr == '(')
            {
               if(stack.size() > 0)
               {
                    sb.append(curr);
               }
               stack.push(curr);
            }
            
            else
            {
                stack.pop();
                if(stack.size() > 0)
                {
                    sb.append(curr);
                }
            }
        }
        return sb.toString();
    }
}