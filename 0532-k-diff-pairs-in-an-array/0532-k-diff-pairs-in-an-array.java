class Solution {
    public int findPairs(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0;
        int right = 1;
        int count = 0;

        while(right < nums.length) {

            if(left == right) {
                right++;
            }
            else if(nums[right] - nums[left] == k) {

                count++;
                int leftValue = nums[left];
                int rightValue = nums[right];
                while(left < nums.length && nums[left] == leftValue) {
                    left++;
                }

                while(right < nums.length && nums[right] == rightValue) {
                    right++;
                }

            }
            else if(nums[right] - nums[left] < k) {
                right++;
            }
            else {
                left++;
            }
        }

        return count;
    }
}