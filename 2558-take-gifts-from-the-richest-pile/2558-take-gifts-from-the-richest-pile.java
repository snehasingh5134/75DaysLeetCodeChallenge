class Solution{
    public long pickGifts(int[] gifts, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> b - a);
        int n = gifts.length;
        long sum = 0;
        for(int i : gifts){
            minHeap.offer(i);
        }
        while(k-- > 0){
            int max = minHeap.poll();
            minHeap.offer((int)Math.sqrt(max));
        }
        int max = 0;
        while(!minHeap.isEmpty()){
            sum += minHeap.poll();
        }
        return sum;
    }
}
// class Solution {
//     public int findMaxInd(int[] gifts){
//         int n = gifts.length;
//         int maxInd = 0, max = 0;
//         for(int i = 0; i < n; i++){
//             max = Math.max(gifts[i], max);
//         }
//         for(int i = 0; i < n; i++){
//             if(max == gifts[i]) maxInd = i;
//         }
//         return maxInd;
//     }
//     public long pickGifts(int[] gifts, int k) {
//         int n = gifts.length;
//         long sum = 0;
//         for(int i = 0; i < k; i++){
//             int maxInd = findMaxInd(gifts);
//             gifts[maxInd] = (int)Math.floor(Math.sqrt(gifts[maxInd]));
//         }
//         for(int i = 0; i < n; i++){
//             sum += gifts[i];
//         }
//         return sum;
//     }
// }