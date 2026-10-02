class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        List<String> ans = new ArrayList<>();

        if (s.length() < 10) {
            return ans;
        }

        HashMap<String, Integer> map = new HashMap<>();

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            
            if (right - left + 1 == 10) {

                String str = s.substring(left, right + 1);

                map.put(str, map.getOrDefault(str, 0) + 1);

               
                if (map.get(str) == 2) {
                    ans.add(str);
                }

                
                left++;
            }
        }

        return ans;
    }
}