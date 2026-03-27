class Solution {
    public boolean possible(int[] arr,int n, int day, int m, int k){
        int count =0;
        int no_Bouquet = 0;
        for(int i =0;i<n;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                no_Bouquet += count/k;
                count=0;
            }
        }
        no_Bouquet+= count/k;
        if(no_Bouquet>=m){
            return true;
        } 
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<(long)m*k) return -1;
        int left = Arrays.stream(bloomDay).min().getAsInt();
        int right = Arrays.stream(bloomDay).max().getAsInt();
        int ans = right;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(possible(bloomDay,n,mid,m,k)){
                ans = Math.min(ans,mid);
                right = mid-1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}