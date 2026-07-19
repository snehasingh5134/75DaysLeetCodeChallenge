class Solution {
    public String smallestSubsequence(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int[] lastoccurence = new int[26];
        boolean[] visited = new boolean[26];
        for(int i = 0; i < s.length(); i++){
            lastoccurence[s.charAt(i) - 'a'] = i;
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(visited[ch - 'a']) continue;
            while(!st.empty() && ch < st.peek() && lastoccurence[st.peek() - 'a'] > i){
                visited[st.peek() - 'a'] = false;
                st.pop();
            }
            st.push(ch);
            visited[ch - 'a'] = true;
        }
        while(!st.empty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}