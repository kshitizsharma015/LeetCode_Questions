// Last updated: 7/9/2026, 6:40:13 PM
/*
 * ans = 1
 * add ans to list then
 * inside loop use this folmula
 * ans = ans * row - col/col;
*/

1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        long ans = 1;
4        
5        List<Integer> list = new ArrayList<>();
6        list.add((int) ans);
7        for(int i = 1;i<rowIndex+1;i++){
8            ans = ans * (rowIndex+1 - i);
9            ans = ans / i;
10            list.add((int) ans);
11
12        }
13        return list;
14    }
15}