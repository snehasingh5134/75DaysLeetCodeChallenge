class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int n = nums.length;
    double sum = 0;
    for(int i = 0; i < k; i++) {
        sum += nums[i];
    }
    double maxSum = sum;
    for(int i = k; i < n; i++) {
        sum += nums[i];
        sum -= nums[i - k];
        maxSum = Math.max(maxSum, sum);
    }
    return maxSum / k;
}
    // public double findMaxAverage(int[] nums, int k) {
    //     int n = nums.length;
    //     double avg = Double.NEGATIVE_INFINITY;
    //     for(int i=0;i<=n-k;i++){
    //         double sum =0;
    //         for(int j=i;j<i+k;j++){
    //             sum+= nums[j];
    //         }
    //         double new_avg = sum/k;
    //         avg = Math.max(avg, new_avg);
    //     }
    //     return avg;
    // }
}