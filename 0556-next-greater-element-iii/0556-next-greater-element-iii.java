class Solution {
    public int nextGreaterElement(int n) {
        int len = (int)Math.log10(n) + 1;
        if(len == 1) return -1;
        int[] arr = new int[len];
        for(int i = len - 1; i >= 0; i--){
            arr[i] = n % 10;
            n /= 10;
        }
        int ind = -1;
        int i = len - 2, j = len - 1;
        while(i >= 0){
            if(arr[i] < arr[j]){
                ind = i;
                break;
            }
            i--;
            j--;
        }
        if(ind == -1) return -1;

        int ind2 = -1;
        for(int k = len - 1; k >= ind; k--){
            if(arr[k] > arr[ind]){
                ind2 = k;
                int t = arr[ind];
                arr[ind] = arr[ind2];
                arr[ind2] = t;
                break;
            }
        }
        reverse(arr, ind + 1, len - 1);
        long ans = 0;
        for(int k : arr){
            ans = ans * 10 + k;
        }
        return ans > Integer.MAX_VALUE ? -1 : (int)ans;
    }
    private void reverse(int[] arr, int s, int e){
        while(s < e){
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
    }
}