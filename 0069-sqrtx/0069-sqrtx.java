class Solution {
    public int mySqrt(int x) {
        // for(int i = 0; i < x/2; i++){
        //     if(i*i == x) return i;
        //     if(i*i < x && (i+1)*(i+1) > x) return i;
        // }
        int l = 0;
        int r = x;
        int ans = 0;
        while(l <= r){
            int mid = l + (r-l)/2;
            long sqrt = (long) mid*mid;
            if(sqrt <= x){
                ans = mid;
                l = mid + 1;
            }
            else r = mid - 1;
        }
        return ans;
    }
}