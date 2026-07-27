class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return (nums[n-1] - 1)*(nums[n-2] - 1);
        // int maxpro = 1;
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         int pro = (nums[i]-1)*(nums[j]-1);
        //         maxpro = Math.max(maxpro,pro);
        //     }
        // }
        // return maxpro;
    }
}