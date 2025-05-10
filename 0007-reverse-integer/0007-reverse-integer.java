class Solution {
    public int reverse(int x) {
      int res= 0;
      while(x!=0){
        int digit=x%10;
        int ans=res*10+digit;
        if((ans-digit)/10!=res){
            return 0;
        }
        res=ans;
        x=x/10;
      }
      return res;
    }
}