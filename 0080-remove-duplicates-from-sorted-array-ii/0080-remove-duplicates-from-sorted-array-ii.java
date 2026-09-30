class Solution {
    public int removeDuplicates(int[] nums) {
    int k = 0;
    Map<Integer, Integer> freq = new HashMap<>();
    for (int x : nums) {
    int c = freq.merge(x, 1, Integer::sum);
    if (c <= 2) nums[k++] = x;
   }
   return k;
    }
}