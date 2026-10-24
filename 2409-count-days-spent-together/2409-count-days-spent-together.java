class Solution {
    public int toDay(String date){
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] parts = date.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int total = day;
        for(int i = 0; i < month - 1; i++){
            total += days[i];
        }
        return total;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start = Math.max(toDay(arriveAlice), toDay(arriveBob));
        int end = Math.min(toDay(leaveAlice), toDay(leaveBob));
        if(start > end) return 0;
        return end - start + 1;
        // int ans = 0;
        // String[] AA = arriveAlice.split("-");
        // String[] LA = leaveAlice.split("-");
        // String[] AB = arriveBob.split("-");
        // String[] LB = leaveBob.split("-");
        // if(Integer.parseInt(LA[0]) - Integer.parseInt(AB[0]) < 0 || Integer.parseInt(AA[0]) > Integer.parseInt(LB[0])) return 0;
        // else{
        //     int a = Integer.parseInt(LA[1]) - Integer.parseInt(AB[1]);
        //     if(a >= 0) ans += a;
        //     int b = Integer.parseInt(LB[1]) - Integer.parseInt(LA[1]);
        //     if(b > 0) ans += b;
        // }
        // return ans;
    }
}