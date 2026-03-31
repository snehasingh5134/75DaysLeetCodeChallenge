class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = nums3.length;
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j] && !lst.contains(nums1[i])){
                    lst.add(nums1[i]);
                }
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n3;j++){
                if(nums1[i]==nums3[j] && !lst.contains(nums1[i])){
                    lst.add(nums1[i]);
                }
            }
        }
        for(int i=0;i<n2;i++){
            for(int j=0;j<n3;j++){
                if(nums2[i]==nums3[j] && !lst.contains(nums2[i])){
                    lst.add(nums2[i]);
                }
            }
        }

        return lst;
    }
}