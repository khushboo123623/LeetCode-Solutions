class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>res=new ArrayList<>();
        if(s.length()<p.length()){
            return res;
        }
        int[] freq = new int[26];
     for(char ch:p.toCharArray()){
        freq[ch-'a']++;
     }
     int left=0;
     int right=0;
     int count=p.length();
      while (right < s.length()) {

            char ch = s.charAt(right);
            if(freq[ch-'a']>0){
                count--;
            }
            freq[ch-'a']--;
            right++;
      
      if(right-left==p.length()){
        if(count==0){
            res.add(left);
        }
         char leftChar = s.charAt(left);

                freq[leftChar - 'a']++;

                if (freq[leftChar - 'a'] > 0) {
                    count++;
                }

                left++;
            }
       }
       return res;

    }
}

       
    
