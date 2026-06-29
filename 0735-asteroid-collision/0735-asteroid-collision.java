class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int asteroid:asteroids){
            while(!st.isEmpty() && st.peek()>0 && st.peek() < -asteroid && asteroid<0){
                st.pop();
            }
            if(st.isEmpty() || asteroid>0 || st.peek()<0){
                st.push(asteroid);
            }else if(st.peek()==-asteroid){
                st.pop();
            }
        }
        int ans[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}