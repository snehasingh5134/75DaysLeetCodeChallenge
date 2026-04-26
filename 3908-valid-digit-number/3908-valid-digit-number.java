class Solution {
    public boolean validDigit(int n, int x) {
        int rem = 0;
        int c = 0;
        while(n>0){
            rem = n%10;
            n = n/10;      
            if(rem==x) c++;
        }
        if(rem==x) return false;
        if(c>0) return true;
        return false;
    }
}