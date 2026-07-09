class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int j = 0, t = 0;
        while (j < n) {
            maxHeap.add(new int[]{nums[j], j});
            int left = j - k + 1;
            while (!maxHeap.isEmpty() &&
                maxHeap.peek()[1] < left) {
                maxHeap.poll();
            }
            if (j >= k - 1) ans[t++] = maxHeap.peek()[0];
            j++;
        }
        return ans;
    }
}

// class Solution { 
//     public int maxOfK(int[] nums, int i, int j){
//         int max = nums[i]; 
//         for(int m = i; m <= j; m++){
//              max = Math.max(max, nums[m]); 
//         } return max; 
//     } 
//     public int[] maxSlidingWindow(int[] nums, int k) { 
//         int n = nums.length; 
//         int[] ans = new int[n - k + 1]; 
//         int i = 0, j = 0, size = 0, t = 0; 
//         while(j < n){ 
//             size = j - i + 1; 
//             if(size == k){ 
//                 ans[t++] = maxOfK(nums, i, j); 
//                 i++; 
//             } 
//             j++; 
//         } 
//         return ans; 
//     } 
// }