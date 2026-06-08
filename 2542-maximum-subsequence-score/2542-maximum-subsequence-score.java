class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = nums1.length;
        int[][] pairs = new int[n][2];
        for(int i = 0; i < n; i++){
            pairs[i][0] = nums2[i];
            pairs[i][1] = nums1[i];
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));//zyada safe mana jata hai kyunki integer overflow ka risk nahi hota
        long sum = 0;
        long ans = 0;
        for(int[] pair : pairs){
            int currNum2 = pair[0];
            int currNum1 = pair[1];
            pq.offer(currNum1);
            sum += currNum1;
            if(pq.size() > k) sum -= pq.poll();
            if(pq.size() == k) ans = Math.max(ans, currNum2 * sum);
        }
        return ans;
    }
}