class Solution {
    public int totalMoney(int n) {
        int money=0;
        for(int i=0;i<n;i++){
            int week = i/7;
            int dayweek = i%7;
            money += week + dayweek + 1;
        }
        return money;
        
    }
}