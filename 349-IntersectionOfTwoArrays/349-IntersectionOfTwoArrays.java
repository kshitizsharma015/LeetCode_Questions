// Last updated: 9/3/2025, 9:24:19 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int n1:nums1){
            set.add(n1);
        }
        for(int n2:nums2){
            if(set.contains(n2)){
                l.add(n2);
                set.remove(n2);
            }
        }
        int[] ans = new int[l.size()];
        for(int i = 0;i < l.size();i++){
            ans[i] = l.get(i);
        }return ans;
    }
}