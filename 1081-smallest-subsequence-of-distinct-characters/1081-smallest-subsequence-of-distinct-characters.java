class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();
        int[] freq = new int[26];
        boolean[] seen = new boolean[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']--;

            if (seen[ch - 'a']) {
                continue;
            }

            while (!st.isEmpty() && st.peek() > ch
                    && freq[st.peek() - 'a'] > 0) {
                seen[st.pop() - 'a'] = false;
            }

            st.push(ch);
            seen[ch - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();

        for (char ch : st) {
            result.append(ch);
        }

        return result.toString();
    }
}