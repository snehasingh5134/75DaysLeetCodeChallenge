class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i=1, k=1, t=1;
        if(n==0){
            return 0;
        }
        while(i<n){
            if(nums[i-1]+1 == nums[i]){
                k++;
            }
            else if(nums[i-1] != nums[i]){
                t = Math.max(t,k);
                k=1;
            }
            i++;
        }
        t = Math.max(t,k);
        return t;
    }
}
