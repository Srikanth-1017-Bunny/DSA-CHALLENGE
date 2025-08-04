import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s1=strs[i];
            char[] charArray=s1.toCharArray();
            Arrays.sort(charArray);
            String s2=new String(charArray);
            if(map.containsKey(s2)==true){
                map.get(s2).add(s1);
            }else{
                map.put(s2,new ArrayList<String>());
                map.get(s2).add(s1);
            }
        }
        for(List<String>v:map.values()){
            ans.add(v);
        }
        return ans;
    }
}