class Solution {
    public int uniqueXorTriplets(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                st.add(nums[i]^nums[j]);
            }
        }
        HashSet<Integer> ans = new HashSet<>();
        for(Integer it : st){
            for(int i = 0; i < nums.length; i++){
                ans.add(nums[i]^it);
            }
        }
        return ans.size();
    }
}