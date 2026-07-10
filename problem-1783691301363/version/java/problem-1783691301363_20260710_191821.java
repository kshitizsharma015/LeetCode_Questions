// Last updated: 7/10/2026, 7:18:21 PM
// Pascal triangle 2 jismein one row generate kervan this uske formule ko us kerke row ke loop mein laga diya...uska refer kero samjh jaoge
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> listmain = new ArrayList<>();
4        for(int  row = 1;row<=numRows;row++){
5        List<Integer> listsub = new ArrayList<>();
6
7            listsub.add((int)1);
8            int ans = 1;
9            for(int col = 1;col<row;col++){
10                ans = ans * (row-col);
11                ans = ans/col;
12                listsub.add((int) ans);
13            }
14            listmain.add(listsub);
15        }
16        return listmain;
17    }
18}