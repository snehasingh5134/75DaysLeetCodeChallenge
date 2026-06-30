class Solution {
    public long countSubarrays(int[] nums, long k) {
        long ans = 0, sum = 0;
        int l = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum * (i - l + 1) >= k){
                sum -= nums[l];
                l++;
            }
            ans += i - l + 1; 
        }
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum += nums[j];
        //         if(sum * (j - i + 1) < k) ans++;
        //     }
        // }
        return ans;
    }
}