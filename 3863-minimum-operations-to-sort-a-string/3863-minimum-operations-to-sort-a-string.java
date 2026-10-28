class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char min = s.charAt(0), max = s.charAt(0);
        boolean isSorted = true;
        for(int i = 1; i < n; i++){
            if(s.charAt(i) < s.charAt(i-1)) isSorted = false;
            if(s.charAt(i) < min) min = s.charAt(i);
            if(s.charAt(i) > max) max = s.charAt(i);
        }
        if(isSorted) return 0;
        if(n == 2) return -1;
        if(s.charAt(0) == min || s.charAt(n - 1) == max) return 1;
        for(int i = 1; i < n - 1; i++){
            if(s.charAt(i) == min || s.charAt(i) == max) return 2;
        }
        return 3;
        // if(n == 1) return 0;
        // int Incnt = 0, Decnt = 0;
        // for(int i = 0; i < s.length() - 1; i++){
        //     if(s.charAt(i) <= s.charAt(i + 1)) Incnt++;
        //     if(s.charAt(i) >= s.charAt(i + 1)) Decnt++;
        // }
        
        // if(Incnt + 1 == s.length()) return 0;
        // if(Decnt + 1 == s.length() && s.length() != 2) return 3;
        // if(Decnt + 1 == s.length() && s.length() == 2) return -1;
        // int mn = 0, mx = 0;
        // int minEle = s.charAt(0);
        // int maxEle = s.charAt(0);
        // for(int i = 1; i < s.length(); i++){
        //     if(minEle > s.charAt(i)){
        //         minEle = s.charAt(i);
        //         mn = i;
        //     }
        //     if(maxEle <= s.charAt(i)){
        //         maxEle = s.charAt(i);
        //         mx = i;
        //     }
        // }
        // if(mn == 0 || mx == s.length() - 1) return 1;
        // return 2;
    }
}