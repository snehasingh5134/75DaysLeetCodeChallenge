class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(mp.containsKey(nums[i])){
                int prevInd = mp.get(nums[i]);
                if(i - prevInd <= k) return true;
            }
            mp.put(nums[i], i);
        }
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(i != j && Math.abs(i - j) <= k && nums[i] == nums[j]) return true;
        //     }
        // }
        return false;
    }
}