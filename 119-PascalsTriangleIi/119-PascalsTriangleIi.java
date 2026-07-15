// Last updated: 7/15/2026, 11:09:09 AM
class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans = 1;
        
        List<Integer> list = new ArrayList<>();
        list.add((int) ans);
        for(int i = 1;i<rowIndex+1;i++){
            ans = ans * (rowIndex+1 - i);
            ans = ans / i;
            list.add((int) ans);

        }
        return list;
    }
}