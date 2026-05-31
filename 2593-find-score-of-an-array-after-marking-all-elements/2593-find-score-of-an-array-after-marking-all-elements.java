class Solution {
    public long findScore(int[] nums) {
        long score = 0;
        int n = nums.length;
        boolean[] mark = new boolean[n];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for(int i = 0; i < n; i++){
            maxHeap.offer(new int[]{nums[i], i});
        }
        while(!maxHeap.isEmpty()){
            int[] curr = maxHeap.poll();
            int val = curr[0];
            int idx = curr[1];
            if(mark[idx]) continue;
            score += val;
            mark[idx] = true;
            if(idx>0) mark[idx-1] = true;
            if(idx<n-1) mark[idx+1] = true;
        }
        return score;
    }
}