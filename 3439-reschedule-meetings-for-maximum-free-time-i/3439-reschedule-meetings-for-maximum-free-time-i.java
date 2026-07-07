class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int sum = 0;
        int max = 0;
        int n = startTime.length;
        int[] gap = new int[n + 1];
        gap[0] = startTime[0];
        
        for(int i = 1; i < n; i++){
            gap[i] = startTime[i] - endTime[i - 1];
        }
        gap[n] = eventTime - endTime[n - 1];
        for(int i = 0; i < gap.length; i++){
            sum += gap[i];
            if(i >= k + 1) sum -= gap[i - (k + 1)];
            if(i >= k) max = Math.max(max, sum);
        }
        return max;
    }
}