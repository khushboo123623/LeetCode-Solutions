class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        if(k<=1) return 0;
       int pro=1;
       int cnt=0;
       int left=0;
       for(int r=0;r<arr.length;r++){
           pro*=arr[r];
           while(pro>=k){
               pro/=arr[left];
               left++;
           }
           cnt+=r-left+1;
       }
       return cnt;
    }
}