class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        int k = 0;
        while(k<n){
            int c = 0;
            for(int i = 0; i<n; i++){
                if(boxes.charAt(i) - '0' == 1){
                    c += Math.abs(i - k);
                }
            }
            ans[k++] = c;
        }
        return ans;
    }
}