class Solution {
    // private int findOne(int n){
    //     int c = 0;
    //     while(n != 0){
    //         n = n & (n - 1);
    //         c++;
    //     }
    //     return c;
    // }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i <= n; i++){
            ans[i] = ans[i >> 1] + (i & 1);  // this formula is imp ->  ans[i] = ans[i >> 1] + (i & 1) // ye dp h
        }
        // for(int i = 0; i <= n; i++){
        //     ans[i] = findOne(i);
        // }
        return ans;
    }
}