class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int t = n1 + n2;
        int[] array = new int[t];
        int i=0;
        int j=0;
        int k=0;
        double median = 0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                array[k++] = nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                array[k++] = nums2[j];
                j++;
            }else{
                array[k++] = nums1[i];
                i++;
            }
        }
        while(i<n1){
            array[k++] = nums1[i];
            i++;
        }
        while(j<n2){
            array[k++] = nums2[j];
            j++;
        }
        if((n1+n2)%2==1){
            return array[(n1+n2)/2];
        }
        else{
            int f= (n1+n2)/2;
            int s = f-1;
            median = (double)(array[f]+array[s])/2;
        }
        return median;
    }
}