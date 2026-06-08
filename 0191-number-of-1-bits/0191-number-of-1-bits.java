class Solution {
    public int hammingWeight(int n) {
        int c = 0;
        while(n != 0){
            n = n & (n-1); // har baar ek 1 gayab ho raha h
            c++;
        }
        // while(n > 0){
        //     int rem = n % 2;
        //     if(rem == 1) c++;   //ye bhi use kr sakte h  -> n & 1
        //     n = n/2;  //ye bhi use kr sakte h  ->  n >>= 1 
        // }
        return c;
    }
}