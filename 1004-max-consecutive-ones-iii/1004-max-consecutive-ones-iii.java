class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0,l=0,zeros=0;
       for(int r=0;r<nums.length;r++){
        if(nums[r]==0) zeros++;
        while(zeros>k){
            if(nums[l]==0){
                zeros--;
                }
            l++;
           
        }
         maxlen=Math.max(r-l+1,maxlen);
       }
       return maxlen;
    }
}