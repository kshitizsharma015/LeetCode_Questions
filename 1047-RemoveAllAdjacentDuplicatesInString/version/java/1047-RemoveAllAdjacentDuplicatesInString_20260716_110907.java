// Last updated: 7/16/2026, 11:09:07 AM
// this we will use stack because it will check the previous element and remove it if qual to current one
1class Solution {
2    public String removeDuplicates(String s) {
3        String x = "";
4        Stack<Character> stack = new Stack<>();
5        for(char ch : s.toCharArray()){
6            if(!stack.isEmpty() && stack.peek()==ch){
7                stack.pop();
8            }
9            else{
10                stack.push(ch);
11            }
12        }
13        while(!stack.isEmpty()){
14            x=stack.pop() + x;
15        }
16        return x;
17    }
18}