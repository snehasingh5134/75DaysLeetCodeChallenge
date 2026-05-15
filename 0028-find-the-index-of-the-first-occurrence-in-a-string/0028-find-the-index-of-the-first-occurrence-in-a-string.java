class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        if(haystack.contains(needle)) return haystack.indexOf(needle);
        return -1;
    }
}