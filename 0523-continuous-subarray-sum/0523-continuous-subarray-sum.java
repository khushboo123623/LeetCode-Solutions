class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       HashMap<Integer,Integer>map=new HashMap<>();
       map.put(0,-1);
       int prefix=0;
       for(int i=0;i<nums.length;i++){
        prefix+=nums[i];
        int rem;
        if(k==0){
            rem=prefix;
        }else{
            rem=prefix%k;
            }
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2){
                    return true;
                }
            }else{
                map.put(rem,i);
            }
       }
       return false;
    }
}