class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] hash = new int[2];
        int t=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target && i!=j){
                    hash[t]=i;
                    hash[t+1]=j;
                    break;
                }
            }
        }
        return hash;
    }
}