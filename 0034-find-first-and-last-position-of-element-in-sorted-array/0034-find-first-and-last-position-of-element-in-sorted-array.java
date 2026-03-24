class Solution {
    public int[] searchRange(int[] nums, int target) {
       int n = nums.length;
       int left =0;
       int right = n-1;
       int[] arr = {-1,-1};
       while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>=target){
                arr[0] = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        if(arr[0]==-1 || nums[arr[0]]!=target){
            arr[0] = -1;
            arr[1]= -1;
            return arr;
        }
        left =0;
        right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]<=target){
                if(nums[mid]==target){
                    arr[1] = mid;
                }
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return arr;
    }  
}