class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();
        int hashlen=256;
        int hash[]=new int[hashlen];
        Arrays.fill(hash,-1);
        int r=0,l=0,maxlen=0;
        while(r<n){
            if(hash[s.charAt(r)]>=l){
                l=Math.max(hash[s.charAt(r)]+1,l);
            }
            int len=r-l+1;
            maxlen=Math.max(len,maxlen);
            hash[s.charAt(r)]=r;
            r=r+1;
        }
        return maxlen;
    }
}