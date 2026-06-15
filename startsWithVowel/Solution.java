import java.util.ArrayList;
import java.util.List;

class Solution{
    public List<String> startsWithVowel(String[] s){
        String vowels = "aeiouAEIOU";
        List<String> result = new ArrayList<>();
        for (String word : s) {
            if (vowels.contains(String.valueOf(word.charAt(0))))
                result.add(word);
        }
        return result;

    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] s={"apple", "banana", "orange", "grape", "umbrella"};
        System.out.println(sol.startsWithVowel(s));
    }
}