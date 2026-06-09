import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t){
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length())
            return false;
        for( char c : s.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);
        for(char c : t.toCharArray()){
            if(!map.containsKey(c))
                return false;
            map.put(c, map.get(c)-1);
            if(map.get(c) < 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        String[] a = {"listen", "silent"};
        String[] b= {"hello", "world"};
        String[] c = {"anagram", "nagaram"};
        System.out.println(sol.isAnagram(a[0], a[1])); 
        System.out.println(sol.isAnagram(b[0], b[1])); 
        System.out.println(sol.isAnagram(c[0], c[1])); 
    }
}
