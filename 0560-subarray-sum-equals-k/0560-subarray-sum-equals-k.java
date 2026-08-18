class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int cnt=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int target=sum-k;
            if(map.containsKey(target)){
                cnt+=map.get(target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}
