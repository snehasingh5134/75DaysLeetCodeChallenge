class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int n = tokens.length;
        for(String s : tokens){
            if(Character.isDigit(s.charAt(0)) || (s.length()>1 && s.charAt(0)=='-')){
                st.push(Integer.parseInt(s));
            }
            else{
                char op = s.charAt(0);
                int n1 = st.pop();  
                int n2 = st.pop();
                switch(op){
                    case '*' :
                        st.push(n2*n1);
                        break;
                    case '+' :
                        st.push(n2+n1);
                        break;
                    case '-' :
                        st.push(n2-n1);
                        break;
                    case '/' :
                        st.push(n2/n1);
                        break;
                }
            }
        }
        return st.pop();
    }
}