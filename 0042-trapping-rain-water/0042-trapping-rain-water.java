class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftmax=0;
        int rightmax=n-1;
        int maxleft=0;
        int maxright=0;
        int totalwater=0;
        while(leftmax<=rightmax){
            if(height[leftmax]<=height[rightmax]){
                if(maxleft<=height[leftmax]){
                    maxleft=height[leftmax];
                }else{
                    totalwater+=maxleft-height[leftmax];
                }
                leftmax++;
            }else{
                if(height[rightmax]>=maxright){
                    maxright=height[rightmax];
                }else{
                    totalwater+=maxright-height[rightmax];
                }
                rightmax--;
            }
        }
        return totalwater;
    }
}