class Solution {
    public int fun(int[] wt,int n, int cap){
        int day=1;
        int load =0;
        for(int i=0;i<n;i++){
            if(load+wt[i]>cap){
                day = day+1;
                load = wt[i];
            }
            else{
                load +=wt[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = Arrays.stream(weights).max().getAsInt();
        int sum =0;
        for(int i=0;i<n;i++){
            sum += weights[i];
        }
        int ans = sum;
        while(max<=sum){
            int mid = max + (sum-max)/2;
            int dayR = fun(weights,n,mid);
            if(dayR<=days){
                ans = mid;
                sum = mid-1;
            }
            else{
                max = mid +1;
            }
        }
        return ans;
    }
}