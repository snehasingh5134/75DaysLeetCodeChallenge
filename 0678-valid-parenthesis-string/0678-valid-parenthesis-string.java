class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                low++;
                high++;
            } 
            else if (ch == ')') {
                low--;
                high--;
            } 
            else { // '*'
                low--;
                high++;
            }
            low = Math.max(0, low);
            if (high < 0) return false;
        }
        return low == 0;
    }

        // int leftpar = 0;
        // int rightpar = 0;
        // int star = 0;
        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(ch == '(') leftpar++;
        //     if(ch == ')') rightpar++;
        //     if(ch == '*') star++;
        // }
        // if(leftpar == rightpar) return true;
        // if(leftpar > rightpar) return leftpar == rightpar + star;
        // else return leftpar + star == rightpar;
}
