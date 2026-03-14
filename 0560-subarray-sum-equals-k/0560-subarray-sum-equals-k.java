class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int i=0, t=0, sum=0;
        while(i<n){
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k){
                    t++;
                }
            }
            i++;
            sum=0;
        }
        return t;
    }
}