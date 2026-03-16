class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int left = i+1;
            int right = n-1;

            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum<0){
                    left++;
                }
                else if(sum>0){
                    right--;
                }
                else{
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]) left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                }
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             int sum= nums[i] + nums[j] + nums[k];
        //             if(sum==0){
        //                 ArrayList<Integer> ls = new ArrayList<>();
        //                 ls.add(nums[i]);
        //                 ls.add(nums[j]);
        //                 ls.add(nums[k]);
        //                 Collections.sort(ls);
        //                 if(!list.contains(ls)){
        //                     list.add(ls);
        //                 }
        //             }
        //         }    
        //     }
        // }
        return list;
    }
}