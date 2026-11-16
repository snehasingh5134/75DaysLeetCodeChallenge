class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int sum = Integer.MAX_VALUE;
        int left = 0;
        while(left < n){
            int right = left;
            int s = 0;
            while(right < n && right - left + 1 <= r){
                s += nums.get(right);
                int length = right - left + 1;
                if(length >= l && s > 0) sum = Math.min(sum, s);
                right++;
            }
            left++;
        }
        return sum == Integer.MAX_VALUE ? -1 : sum;
    }
}