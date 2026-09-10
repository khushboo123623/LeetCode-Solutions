class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : t.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;

        int formed = 0;
        int required = map1.size();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);

            map2.put(ch, map2.getOrDefault(ch, 0) + 1);

            if (map1.containsKey(ch) &&
                map2.get(ch).intValue() == map1.get(ch).intValue()) {

                formed++;
            }

            while (formed == required) {

                
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

               
                char leftChar = s.charAt(left);

                map2.put(leftChar, map2.get(leftChar) - 1);

               
                if (map1.containsKey(leftChar) &&
                    map2.get(leftChar) < map1.get(leftChar)) {

                    formed--;
                }

                left++;
            }

            right++;
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}