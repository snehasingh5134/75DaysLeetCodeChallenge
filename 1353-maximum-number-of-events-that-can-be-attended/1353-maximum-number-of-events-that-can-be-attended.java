class Solution {
    public int maxEvents(int[][] events) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int r = events.length, c = events[0].length;
        int i = 0, day = 1, ans = 0;
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        while(i < r || !minHeap.isEmpty()){
            if(minHeap.isEmpty() && i < r) day = events[i][0];
            while(i < r && events[i][0]<=day){
                minHeap.offer(events[i][1]);
                i++;
            } 
            while(!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }
            if(!minHeap.isEmpty()) {
                minHeap.poll();
                ans++;
            }
            day++;
        }
        return ans;
    }
}