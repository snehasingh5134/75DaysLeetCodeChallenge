class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        int i=0, j=0;
        int k = s1.length;
        int m = t1.length;
        if(k!=m){
            return false;
        }
        while(i<k){
            if(s1[i]==t1[j]){
                i++;
                j++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}