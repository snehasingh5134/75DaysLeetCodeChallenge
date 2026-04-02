class Solution {
    public int function(int[] nums, int mid){
        int n = nums.length;
        int ways =1;
        int sum =0;
        for(int i=0;i<n;i++){
            if(sum + nums[i] <= mid){
                sum +=nums[i];
            }
            else{
                ways++;
                sum = nums[i];
            }
        }
        return ways;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int sum =0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        int max = sum;
        int min = Arrays.stream(nums).max().getAsInt();
        while(min<=max){
            int mid = min + (max-min)/2;
            int ways = function(nums,mid);
                if(ways>k) min = mid +1;
                else max = mid -1;
        }
        return max+1;
    }
}