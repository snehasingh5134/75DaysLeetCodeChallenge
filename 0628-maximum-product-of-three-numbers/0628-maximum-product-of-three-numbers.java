class Solution {
    public int maximumProduct(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            maxHeap.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            minHeap.add(nums[i]);
        }
        int lar1 = maxHeap.poll();
        int lar2 = maxHeap.poll();
        int lar3 = maxHeap.poll();
        int pro1 = lar1*lar2*lar3;
        int sma1 = minHeap.poll();
        int sma2 = minHeap.poll();
        int pro2 = lar1*sma1*sma2;
        return Math.max(pro1, pro2);
    }
}