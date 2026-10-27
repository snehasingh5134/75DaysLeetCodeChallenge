class Solution {
    private int findRotations(int[] nums){ //[2,0,1]
        int n = nums.length; // 3
        int index = -1;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                index = i; // 1
                break;
            }
        }
        for(int i = 0; i < n; i++){ //1
            if(nums[(index + i) % n] != i) return -1; //num[(1+1) != 1]
        }
        return index;
    }
    public int minOperations(int[] nums) {
        int n = nums.length;
        //Case 1 : Only left rotations
        int rotations = findRotations(nums);
        int ans = Integer.MAX_VALUE;
        if(rotations != -1) ans = Math.min(rotations, n - rotations + 2);

        //Case 2 : Reverse, then rotate
        int[] reversed = nums.clone();
        for(int i = 0; i < n/2; i++){
            int temp = reversed[i];
            reversed[i] = reversed[n - i - 1];
            reversed[n - i - 1] = temp;
        }
        int t = findRotations(reversed);
        if(t != -1) ans = Math.min(ans, Math.min(t + 1, n - t + 1));

        return ans == Integer.MAX_VALUE ? -1 : ans;                                      
    }
}