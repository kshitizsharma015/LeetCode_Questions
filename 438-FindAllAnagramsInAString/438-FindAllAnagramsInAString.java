// Last updated: 7/15/2026, 11:08:53 AM
class Solution {
    public List<Integer> findAnagrams(String txt, String pat) {
      
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
       
        ArrayList<Integer> ans = new ArrayList<>();
        for(int k = 0;k<pat.length();k++){
            char ch = pat.charAt(k);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int count = map.size();
        while(j<txt.length()){
            if(map.containsKey(txt.charAt(j))){
                map.put(txt.charAt(j),map.get(txt.charAt(j))-1);
                if(map.get(txt.charAt(j))==0){
                    count--;
                
                    
                }
            }
            if((j-i+1)<pat.length()){
                j++;
            }
            else if((j-i+1)==pat.length()){
                if(count==0){
                        ans.add(i);
                    }
                if(map.containsKey(txt.charAt(i))){
                    if(map.get(txt.charAt(i))==0){
                        count++;
                    }
                    map.put(txt.charAt(i),map.get(txt.charAt(i))+1);
                    
                }
                i++;
                j++;
            }
            
        }
        return ans;
    }
}
    