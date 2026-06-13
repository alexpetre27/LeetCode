import java.util.HashMap;

class Solution{
    public char firstUniqueChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
      for (char c : s.toCharArray())
             map.put(c, map.getOrDefault(c, 0) + 1);
            for (char c : s.toCharArray())
    if (map.get(c) == 1)
        return c;
return '\0';
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        String[] s={"aabbcd","aabb","leetcode"};
        System.out.println(sol.firstUniqueChar(s[0]));
        System.out.println(sol.firstUniqueChar(s[1]));
        System.out.println(sol.firstUniqueChar(s[2]));
    }
}