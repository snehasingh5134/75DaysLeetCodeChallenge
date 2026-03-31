class Solution {
    public int findGCD(int[] nums) {
        int a = Arrays.stream(nums).max().getAsInt();
        int b = Arrays.stream(nums).min().getAsInt();
        while(a>0 && b>0){
            if(b>a){
                b = b%a;
            }
            else{
                a = a%b;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
}