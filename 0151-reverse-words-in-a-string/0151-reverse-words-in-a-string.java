class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            if(arr[i] == "  ") arr[i] = "";
            String temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        String ans = String.join(" ", arr);
        ans = ans.trim();
        ans = ans.replaceAll("\\s+", " ");
        return ans;
    }
}