class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i = 1; i <= amount; i++){
            for(int coin : coins){
                if(i >= coin){
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        if(dp[amount] == amount + 1) return -1;
        return dp[amount];
        // HashSet<Integer> mp = new HashSet<>();
        // if(amount == 0) return 0;
        // int min = Integer.MAX_VALUE;
        // int n = coins.length;
        // for(int i = 0; i < n; i++){
        //     mp.add(coins[i]);
        // }
        // for(int i = 0; i < n; i++){
        //     int quest = amount / coins[i];
        //     int rem = amount % coins[i];
        //     if(mp.contains(rem)){
        //         min = Math.min(min, quest + rem);
        //     }
        // }
        // return min == Integer.MAX_VALUE ? -1 : min;
    }
}