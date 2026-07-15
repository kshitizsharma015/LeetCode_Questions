// Last updated: 7/15/2026, 11:09:11 AM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listmain = new ArrayList<>();
        for(int  row = 1;row<=numRows;row++){
        List<Integer> listsub = new ArrayList<>();

            listsub.add((int)1);
            int ans = 1;
            for(int col = 1;col<row;col++){
                ans = ans * (row-col);
                ans = ans/col;
                listsub.add((int) ans);
            }
            listmain.add(listsub);
        }
        return listmain;
    }
}