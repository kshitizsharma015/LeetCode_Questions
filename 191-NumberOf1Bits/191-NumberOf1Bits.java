// Last updated: 9/3/2025, 9:24:27 PM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        return countOne(n,count);
    }
    public int countOne(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2==1){
            count = count + 1;
        }
        return countOne(n/2,count);

    }
}