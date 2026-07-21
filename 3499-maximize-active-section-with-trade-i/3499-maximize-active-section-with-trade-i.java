class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int total_one = 0;
        ArrayList<Character> ch = new ArrayList<>();
        ArrayList<Integer> size = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(c == '1') total_one++;
        }
        s = "1" + s + "1";
        int i = 0;
        while(i<s.length()){
            int j = i;
            while(j < s.length() && s.charAt(j)==s.charAt(i)){
                j++;
            }
            ch.add(s.charAt(i));
            size.add(j-i);
            i = j;
        }
        int maxLR = 0;
        for(int k = 1; k < ch.size()-1; k++){
            if(ch.get(k)=='1' && ch.get(k-1)=='0' && ch.get(k+1)=='0'){ 
                int LR = size.get(k-1) + size.get(k +1);
                maxLR = Math.max(maxLR,LR);
            }
        }
        return maxLR+total_one;
    }
}