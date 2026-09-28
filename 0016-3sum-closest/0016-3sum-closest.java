class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close=nums[0]+ nums[1]+nums[2];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target)<Math.abs(close-target)){
                    close=sum;
                }if(sum<target){
                    left++;
                }else if(sum>target){
                    right--;
                }else{
                    return sum;
                }
            }
        }
        return close;
     }
}