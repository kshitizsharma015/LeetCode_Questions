// Last updated: 7/22/2026, 9:47:58 AM
// this was just basic use of stack peek and pop peration with certain condition
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> s = new Stack<>();
4        for(int  i  = 0;i<operations.length;i++){
5        if(operations[i].equals("+")){
6            int x=s.pop();
7            int y = s.peek();
8            int z = x+y;
9            s.push(x);
10            s.push(z);
11        }
12        else if(operations[i].equals("D")){
13            int a = s.peek();
14            int c = a*2;
15            s.push(c); 
16        }
17        else if(operations[i].equals("C")){
18            s.pop();
19        }
20        else{
21            s.push(Integer.parseInt(operations[i]));
22        }
23        }
24        int sum = 0;
25        for (int item : s) {
26            sum = sum + item; 
27        }
28        return sum;
29    }
30}