class Solution {
    public int maxArea(int[] arr) {
     int maxA=0;
        int le=0;
        int ri=arr.length-1;
        while(le<=ri){
            int hei=Math.min(arr[le],arr[ri]);
            int wid=ri-le;
            int area=hei*wid;
            maxA=Math.max(maxA,area);
            if(arr[le]<=arr[ri]){
            le++;
        }else{
            ri--;
        }
        }
        return maxA;
        }
}