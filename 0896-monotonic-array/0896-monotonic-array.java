class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean isDec = true;
        boolean isAsc = true;
        for(int i = 0; i < n-1; i++){
            if(nums[i] < nums[i+1]) isDec = false;
            if(nums[i] > nums[i+1]) isAsc = false;
        }
        return isAsc || isDec;
    }
}