// Last updated: 9/3/2025, 9:24:22 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
            }
        return power(n,1);
    }
    static boolean power(int n,int x){
        if(x==n){
            return true;
        }
        if(x>n || x>Integer.MAX_VALUE / 4){
            return false;
        }
        return power(n,x*4);
    }
}