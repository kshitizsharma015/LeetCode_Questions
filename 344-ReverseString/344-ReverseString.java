// Last updated: 9/3/2025, 9:24:21 PM
class Solution {
    public void reverseString(char[] s) {
        recc(s,0,s.length-1);
    }
    public void recc(char[] s,int start,int end){
        if(start>=end){
            return;}
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        recc(s,start+1,end-1);

        
    }
}