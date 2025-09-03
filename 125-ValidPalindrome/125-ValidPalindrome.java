// Last updated: 9/3/2025, 9:24:29 PM
class Solution {
    public boolean isPalindrome(String s) {
        String one = s.toLowerCase();
        String two = one.replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = two.length()-1;
        while(i<j){
            if(two.charAt(i) != two.charAt(j)){
                return false;
            }
                i++;
                j--;    
        }
        return true;
    }
}