class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int m=nums2.length;
       int ans1[] =new int[m];
       Stack<Integer>st=new Stack<>();
       for(int i=m-1;i>=0;i--){
        while(!st.isEmpty() && st.peek()<=nums2[i]){
            st.pop();
        }
        if(st.isEmpty()){
            ans1[i]=-1;
        }else{
            ans1[i]=st.peek();
           
        }
        st.push(nums2[i]);
       }
       int ans[]=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
        for(int j=0;j<m;j++){
            if(nums1[i]==nums2[j]){
                ans[i]=ans1[j];
                break;
            }
        }
       }
       return ans;
    }
}