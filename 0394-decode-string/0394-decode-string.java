class Solution {
    public String decodeString(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch !=']') st.push(ch);
            else{
                String t = "";
                while(st.peek() != '[') t = st.pop() + t;
                st.pop();
                String num = "";
                while(!st.isEmpty() && Character.isDigit(st.peek())) num = st.pop() + num;
                int k = Integer.parseInt(num);
                String temp = "";
                for(int i = 0; i < k; i++) temp += t;
                for(char c : temp.toCharArray()) st.push(c);
            }
        }
        String ans = "";
        while(!st.isEmpty()) ans = st.pop() + ans;
        return ans;
    }
}