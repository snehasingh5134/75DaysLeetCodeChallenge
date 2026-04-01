class Solution {
    int countDigit(int low){
        int c=0;
        while(low>0){
            low = low/10;
            c++; 
        }
        return c;
    }
    boolean check_sum(int low, int digit){
        int sum1=0;
        int sum2=0;
        String st = String.valueOf(low);
        for(int i=0;i<digit/2;i++){
            sum1+= st.charAt(i) - '0';
        }
        for(int i=digit/2;i<digit;i++){
            sum2+= st.charAt(i) - '0';
        }
        if(sum1==sum2) return true;
        return false;
    }
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;
        while(low<=high){
            boolean sum =false;
            int no_digit = countDigit(low);
            if(no_digit%2==0){
                sum = check_sum(low, no_digit);
            }
            if(sum) ans++;
            low++;
        }
        return ans;
    }
}