class Solution {
    public int maxSubarraySumCircular(int[] arr) {
         int total=0;
        int currms=0;
        int maxsum=arr[0];
        int currmins=0;
        int minsum=arr[0];
        for(int num:arr){
            currms=Math.max(num,currms+num);
            maxsum=Math.max(currms,maxsum);
            currmins=Math.min(num,currmins+num);
            minsum=Math.min(currmins,minsum);
            total+=num;
            
        }if(maxsum<0){
            return maxsum;
        }
        int circularSum = total - minsum;

        return Math.max(maxsum, circularSum);
    }
}