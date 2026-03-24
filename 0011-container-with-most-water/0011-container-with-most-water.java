class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int area = 0;
        int left = 0;
        int right = n-1;
        while(left<right){
            int min = Math.min(height[left],height[right]);
            int max_area = min*(right-left);
            if(max_area>area){
                area = max_area;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        // for(int i = 0; i < n; i++){
        //     for(int j = i+1 ; j < n; j++){
        //         int min = Math.min(height[i],height[j]);
        //         int max_area = min*(j-i);
        //         if(max_area>area){
        //             area = max_area;
        //         }
        //     }
        // }
        return area;
    }
}