import java.util.HashMap;
import java.util.Map;

public class Solution{
    public String mostFrequentWord(String s) {
        HashMap<String,Integer> map = new HashMap();
        String[] res=s.split(" ");
        for(String d : res)
            map.put(d, map.getOrDefault(d, 0)+1);
return map.entrySet().stream()
   .max(Map.Entry.comparingByValue())
   .get()
   .getKey();    
   
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "ana are mere ana are";
        String b = "a b c";
        String c = "hello world hello java hello";
        System.out.println(sol.mostFrequentWord(s));
        System.out.println(sol.mostFrequentWord(b));
        System.out.println(sol.mostFrequentWord(c));
    }
}