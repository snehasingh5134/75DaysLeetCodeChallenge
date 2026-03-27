class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int length =0;
        int i=0;
        int j=0;
        while(j<n){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i){
                i = map.get(ch)+1;
            }
            map.put(ch,j);
            length = Math.max(length,j-i+1);
            j++;
        }
        return length;
    }
}