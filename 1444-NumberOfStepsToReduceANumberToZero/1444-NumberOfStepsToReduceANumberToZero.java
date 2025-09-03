// Last updated: 9/3/2025, 9:24:12 PM
class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        return steps(num,count);
    }
    public static int steps(int num,int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            count++;
            return steps(num/2,count);
        }
        else{
            count++;
            return steps(num-1,count);
        }
    }
}