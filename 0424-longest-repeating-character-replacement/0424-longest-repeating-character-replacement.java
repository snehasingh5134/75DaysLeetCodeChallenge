class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] hash = new int[26];
        int l =0;
        int r =0;
        int max_len =0;
        int max_freq = 0;
        while(r<n){
            hash[s.charAt(r)-'A']++;
            max_freq = Math.max(max_freq,hash[s.charAt(r)-'A']);
            while((r-l+1) - max_freq >k){
                hash[s.charAt(l)-'A']--;
                l++;
                // max_freq =0;
                // for(int i=0;i<n;i++){
                //     max_freq = Math.max(max_freq,hash[i]);
                //     l++;
                // }
            }
            
                max_len = Math.max(max_len, r-l+1);
            
            r++;
        }
        // int max_len =0;
        // for(int i=0;i<n;i++){
        //     int[] hash = new int[26];
        //     int max_Freq = 0;
        //     int change =0;
        //     for(int j=i;j<n;j++){
        //         hash[s.charAt(j)-'A']++;
        //         max_Freq = Math.max(max_Freq,hash[s.charAt(j)-'A']);
        //         change = (j-i+1) - max_Freq;
        //         if(change<=k){
        //             max_len = Math.max(max_len,j-i+1);
        //         }
        //         else{
        //             break;
        //         }a
        //     }
        // }
        return max_len;
    }
}