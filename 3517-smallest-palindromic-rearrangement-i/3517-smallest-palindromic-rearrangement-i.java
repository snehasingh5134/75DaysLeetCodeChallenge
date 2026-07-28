class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        StringBuilder left = new StringBuilder();
        char middle = 0;
        for(char ch : s.toCharArray()){
            freq[ch - 'a'] ++;
        }
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < freq[i]/2; j++){
                left.append((char)(i + 'a'));
            }
            if(freq[i] % 2 == 1) middle = (char)(i + 'a');
        }
        StringBuilder right = new StringBuilder(left).reverse();
        if(middle == 0) return left.toString() + right.toString();
        return left.toString() + middle + right.toString(); 
    }
}