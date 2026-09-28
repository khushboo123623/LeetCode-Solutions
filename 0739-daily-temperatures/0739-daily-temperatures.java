class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int m=temp.length;
        int ans[]=new int[m];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<m;i++){
            while(!st.isEmpty() && temp[st.peek()]<temp[i]){
                int idx=st.pop();
                ans[idx]=i-idx;
            }
            st.push(i);
        }
        return ans;
    }
}