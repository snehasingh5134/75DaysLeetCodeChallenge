class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
        if (a[1] != b[1]) return b[1] - a[1]; // larger distance = worse
        return b[0] - a[0];                   // equal distance: larger value = worse
        });
        for(int i = 0; i < arr.length; i++){
            maxHeap.add(new int[]{arr[i], Math.abs(arr[i] - x)});
            if(maxHeap.size() > k) maxHeap.poll();
        }
        List<Integer> ans = new ArrayList<>();
        while(!maxHeap.isEmpty()){
            ans.add(maxHeap.poll()[0]);
        }
        Collections.sort(ans);
        return ans;
    }
}