class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int rev1 = 0;
        int rev2=0;
        while(temp!=0){
            int digit1 = temp%10;
            rev1 = rev1*10 + digit1;
            temp=temp/10;
        }
        temp=rev1;
        while(temp!=0){
            int digit2= temp%10;
            rev2 = rev2*10+digit2;
            temp=temp/10;
        }
        if(num==rev2) return true;
        else return false;
    }
}