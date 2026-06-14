import java.util.HashMap;

class Solution{
    public boolean isAnagram(String s, String t){
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length())
            return false;
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        for(char c : t.toCharArray()){
            if(!map.containsKey(c)) return false;
            map.put(c, map.get(c)-1);
            if(map.get(c) < 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] s={"listen","hello","anagram"};
        String[] t={"silent","world","nagaram"};
        System.out.println(sol.isAnagram(s[0],t[0]));
        System.out.println(sol.isAnagram(s[1],t[1]));
        System.out.println(sol.isAnagram(s[2],t[2]));
    }
}