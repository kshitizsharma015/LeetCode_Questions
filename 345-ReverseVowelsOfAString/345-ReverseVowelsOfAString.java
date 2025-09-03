// Last updated: 9/3/2025, 9:24:20 PM
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
            if(isvowel(arr[i])&&isvowel(arr[j])){
                char temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }else if(isvowel(arr[i])){
                j--;
            }else{
                i++;
            }
        }
        return new String(arr);
    }
    public boolean isvowel(char ch){
        if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch =='E' || ch == 'I' || ch == 'O' || ch == 'U'){
        return true;
        }
        return false;
    }
}