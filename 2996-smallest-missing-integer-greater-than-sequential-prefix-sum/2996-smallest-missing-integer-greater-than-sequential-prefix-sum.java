class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int SeqMax = nums[0];
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1] + 1){
                SeqMax = prefixSum[i];
            } 
            else break;
        }
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            if(SeqMax == nums[i]) SeqMax++;
        }
        return SeqMax;
    }
}