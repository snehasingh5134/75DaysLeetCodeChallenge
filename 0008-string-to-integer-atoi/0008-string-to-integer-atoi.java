class Solution {
    public int myAtoi(String s) {
        StringBuilder st = new StringBuilder();
        int sign = 1;
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        if(i < s.length() && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if(i < s.length() && s.charAt(i) == '+'){
            i++;
        }
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch < '0' || ch > '9') break;
            st.append(ch);
            i++;
        }
        long ans = 0;
        for(int  j = 0; j < st.length(); j++){
            int digit = st.charAt(j) - '0';
            ans = ans * 10 + digit;
             
            if (sign == 1 && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign == -1 && ans > 2147483648L) {
                return Integer.MIN_VALUE;
            }
        }
        return (int)(ans * sign);
        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(ch == ' ' || ch == '_' || (i != 0 && s.charAt(i - 1) == '-' && ch == '0') || ch == '-'){
        //         continue;
        //     }
        //     else if((ch > 'a' && ch < 'z') || (i != 0 && ch == '-' && s.charAt(i - 1) != ' ')){
        //         break;
        //     }
        //     else{
        //         st.append(ch);
        //     }
        // }
        // String str = st.toString();
        // int ans = 0;
        // for(int i = 0; i < str.length(); i++){
        //     int digit = str.charAt(i) - '0';
        //     ans = ans * 10 + digit;
        // }
        // return ans;
    }
}