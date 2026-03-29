class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        int low = 0;
        int high = n-1;
        for(int i=0;i<n;i++){
            mp.put(arr[i],arr[i]-(i+1));
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mp.get(arr[mid])<k) low = mid+1;
            else high = mid-1;
        }
        return k + high + 1;
    }
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int i=1;
    //     int j=0;
    //     while(list.size() < k){
    //         if(j<arr.length && i==arr[j]){
    //             j++;
    //         }
    //         else{
    //             list.add(i);
    //         }
    //         i++;
    //     }
    //     return list.get(k-1);
    // }
    // static {
    //   Runtime.getRuntime().addShutdownHook(new Thread(() -> {
    //     try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
    //       fw.write("0");
    //     } catch (Exception _) {
    //     }
    //   }));
    // }
}