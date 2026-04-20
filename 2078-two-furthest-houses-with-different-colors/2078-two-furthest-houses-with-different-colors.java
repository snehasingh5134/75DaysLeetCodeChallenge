class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int diff = 0;
        for(int i =0;i<n-1;i++){
            for(int j =0;j<n;j++){
                if(colors[i]!=colors[j]) diff = Math.max(diff,Math.abs(i-j));
            }
        }
        return diff;
    }
}