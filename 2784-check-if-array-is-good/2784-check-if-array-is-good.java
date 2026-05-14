class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int maxele = Arrays.stream(nums).max().getAsInt();
        int[] hash = new int[maxele+1];
        for(int i = 0; i < n; i++){
            hash[nums[i]]++;
        }
        for(int i = 1; i < hash.length; i++){
            if(hash[hash.length-1] != 2) return false;
            if(hash[i] != 1 && i!=hash.length-1) return false;
        }
        return true;
    }
}