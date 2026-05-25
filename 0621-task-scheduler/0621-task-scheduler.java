class Solution {
    public int leastInterval(char[] tasks, int n) {
        int countMax = 0;
        int maxFreq = 0;
        int[] freq = new int[26];
        for(char ch : tasks) freq[ch - 'A']++;
        for(int f : freq) maxFreq = Math.max(maxFreq, f);
        for(int f : freq){
            if(f == maxFreq) countMax++;
        }
        int ans = (maxFreq - 1) * (n + 1) + countMax;
        return Math.max(ans, tasks.length);
    }
}