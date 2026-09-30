class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                st.push(nums[i]);
            }else{
                while(!st.isEmpty()&&st.peek()>0&&st.peek()<Math.abs(nums[i])){
                    st.pop();
                }
                if(st.isEmpty()||st.peek()<0){
                    st.push(nums[i]);
                }
                if(st.peek()==Math.abs(nums[i])){
                    st.pop();
                }
            }
        }
        int ans[]=new int[st.size()];
        int k=st.size()-1;
        while(!st.isEmpty()){
            ans[k--]=st.pop();
        }
        return ans;
    }
}