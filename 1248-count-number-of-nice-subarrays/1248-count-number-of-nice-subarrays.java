class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        //------sliding window approach------
        // for atmost k
        int l = 0, r = 0, atMostK =0, oddno1 = 0;
        while(r < nums.length){
            if(nums[r] % 2 == 1) oddno1++;
            while(oddno1 > k) {
                if(nums[l] % 2 == 1) oddno1--;
                l++;
            } 
            atMostK += r - l + 1;
            r++;
        }
        // for atmost k - 1
        int t = 0, s = 0, atMostK1 =0, oddno2 = 0;
        while(s < nums.length){
            if(nums[s] % 2 == 1) oddno2++;
            while(oddno2 > k - 1) {
                if(nums[t] % 2 == 1) oddno2--;
                t++;
            } 
            atMostK1 += s - t + 1;
            s++;
        }
        return atMostK - atMostK1;
        //------------brute force approach--------------
        // int ans = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int oddno = 0;
        //     for(int j = i; j < nums.length; j++){
        //         if(nums[j] % 2 == 1) oddno++;
        //         if(oddno == k) ans++;
        //     }
        // }
        // return ans;
    }
}