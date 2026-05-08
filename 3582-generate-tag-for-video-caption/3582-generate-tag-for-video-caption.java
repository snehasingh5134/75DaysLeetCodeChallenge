class Solution {
    public String generateTag(String caption) {
        caption = caption.toLowerCase().trim();
        StringBuilder tag = new StringBuilder();
        tag.append('#');
        int i = 0;
        int n = caption.length();
        while(i < n){
            if(tag.length() == 100) break; 
            char ch = caption.charAt(i);
            if(ch == ' '){
                while(ch == ' '){
                    i++;
                    ch = caption.charAt(i);
                }
                tag.append(Character.toUpperCase(ch));
            }else{
                tag.append(ch);
            }
            i++;
        }
        return tag.toString();
    }
}



