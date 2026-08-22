class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        long win_sum=0;
        long max_sum=0;
        for(int i=0;i<k;i++){
            win_sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size()==k){
             max_sum=win_sum;
        }
        for(int j=k;j<nums.length;j++){
            win_sum+=nums[j];
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            int rmv=nums[j-k];
            win_sum-=rmv;
            map.put(rmv,map.get(rmv)-1);
            if(map.get(rmv)==0){
                map.remove(rmv);
            }
            if(map.size()==k){
            max_sum=Math.max(max_sum,win_sum);
            }
        }
        return max_sum;
    }
}