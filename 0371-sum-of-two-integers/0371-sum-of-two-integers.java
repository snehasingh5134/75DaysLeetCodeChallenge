class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int carry = (a & b) << 1; // AND -> carry , <<1 -> carry ko next position par bhejo
            a = a ^ b; //XOR -> sum without carry
            b = carry;
        }
        return a;
    }
}