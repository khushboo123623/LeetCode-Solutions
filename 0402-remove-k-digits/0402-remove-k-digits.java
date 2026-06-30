class Solution {
    public String removeKdigits(String s, int k) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
        while( !st.isEmpty() &&k >0 && st.peek()>s.charAt(i)){
            st.pop();
            k--;
        }
        st.push(s.charAt(i));
    }
        
        while(k>0){
            st.pop();
            k--;
        }if(st.isEmpty()) return "0";
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
         res.reverse();
        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
           
        }
        if(res.length()==0) return "0";
        return res.toString();
    }
}