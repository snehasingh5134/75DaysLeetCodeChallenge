class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        int[] prefixXOR = new int[arr.length];
        prefixXOR[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixXOR[i] = prefixXOR[i-1] ^ arr[i];
        }
        for(int i = 0; i < n; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            if(left == 0) ans[i] = prefixXOR[right];
            else ans[i] = prefixXOR[right] ^ prefixXOR[left - 1];
        }
        // for(int i = 0; i < n; i++){
        //     int xor = 0;
        //     for(int j = queries[i][0]; j <= queries[i][1]; j++){
        //         xor ^= arr[j];
        //     }
        //     ans[i] = xor;
        // }
        return ans;
    }
}