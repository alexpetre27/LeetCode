class Solution{
    public String longestWord(String[] words){
        String longest="";
        for(String word : words){
            if(longest.length() <word.length())
                longest = word;
        }
        return longest;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] s1={"cat", "elephant", "dog", "hi"};
        String[] s2={"a", "bb", "ccc"};
        String[] s3={"hello", "world"};
        System.out.println(sol.longestWord(s1));
        System.out.println(sol.longestWord(s2));
        System.out.println(sol.longestWord(s3));
    }
}