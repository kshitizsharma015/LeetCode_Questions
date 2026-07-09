// Last updated: 7/9/2026, 11:06:54 AM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        int n = digits.length;
4        for(int  i = n-1 ;i>=0;i--){
5            if(digits[i]<9){
6                digits[i]=digits[i]+1;
7                return digits;
8            }
9            else{
10                digits[i]=0;
11            }
12        }
13        int ans[] = new int[n+1];
14        ans[0]=1;
15        return ans;
16
17        
18    }
19}