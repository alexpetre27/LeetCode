import java.util.*;

class Solution{
    public Map<Integer,List<String>> groupByLength(String[] s){
        HashMap<Integer,List<String>>  map= new HashMap<>();
        for(String ss : s)
            map.computeIfAbsent(ss.length(), j-> new ArrayList<>()).add(ss);
        
        return map;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        String[] s ={"cat","dog","hi","elephant","go"};
        System.out.println(sol.groupByLength(s));
    }
}