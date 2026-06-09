import java.util.*;

public class Solution {
    public int lengthOfTheLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
       int l = 0, maxLength=0;
       for(int r= 0; r < s.length();++r){
            char c=s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            maxLength=Math.max(maxLength,r-l+1);
       }
       return maxLength;

    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] s = {"abcabcbb","bbbbbbb","pwwkew"};
        System.out.println(sol.lengthOfTheLongestSubstring(s[0]));
        System.out.println(sol.lengthOfTheLongestSubstring(s[1]));
        System.out.println(sol.lengthOfTheLongestSubstring(s[2]));
    }
}
