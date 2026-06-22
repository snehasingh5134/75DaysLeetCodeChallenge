class Solution {
    private void findSubsets(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ls){
        ls.add(new ArrayList<>(ds));
        for(int i = ind; i < nums.length; i++){
            if(i != ind && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            findSubsets(i + 1, nums, ds, ls);
            ds.remove(ds.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ls);
        return ls;
    }
}