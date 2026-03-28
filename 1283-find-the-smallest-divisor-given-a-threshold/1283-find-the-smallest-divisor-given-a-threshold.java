class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int r = Arrays.stream(nums).max().getAsInt();
        int ans =r;
        int l = 1;
        while(l<=r){
            int mid = l + (r-l)/2;
            int sum = 0;
            for(int i=0;i<n;i++){
                sum+= (nums[i]+mid-1)/mid;
            }
            if(sum<=threshold){
                ans = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        // for(int i=1;i<=max;i++){
        //     int sum =0;
        //     for(int j=0;j<n;j++){
        //         sum+= (nums[j]+i-1)/i;
        //     }
        //     if(sum<=threshold){
        //         ans = i;
        //         break;
        //     }
        // }
        return ans;
    }
}