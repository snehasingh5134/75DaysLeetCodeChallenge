class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length() < k) return 0;
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        int left = 0;
        int right = 0;
        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i) - 'a'] < k){
                return Math.max(longestSubstring(s.substring(0, i), k), longestSubstring(s.substring(i + 1), k));
            }
        }
        return s.length();
    }
}