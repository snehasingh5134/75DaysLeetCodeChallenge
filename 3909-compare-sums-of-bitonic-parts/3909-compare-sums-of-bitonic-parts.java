class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length;
        long ascSum = 0;
        long dscSum = 0;
        boolean f = false;
        for(int i=0;i<n-1;i++){
            if(nums[i]<=nums[i+1]){
                ascSum += nums[i];
            }
            if(nums[i]>=nums[i+1] && f==false){
                ascSum += nums[i];
                f = true;
            }
            if(nums[i]>=nums[i+1] && f==true){
                dscSum+=nums[i];
            }
        }
        dscSum += nums[n-1];
        if(ascSum>dscSum) return 0;
        if(ascSum<dscSum) return 1;
        return -1;
    }
}