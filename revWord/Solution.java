class Solution{
    public String revWord(String s){
        StringBuilder sb = new StringBuilder();
        if(s.length() <= 1 )
            return s;
        for(int i = s.length()-1; i >=0; --i)
            sb.append(s.charAt(i));
        return sb.toString();

    }
    public static void main (String[] args){
        Solution sol = new Solution();
        String s="hello";
        String s2="abcde";
        String s3="racecar";
        System.out.println(sol.revWord(s));
        System.out.println(sol.revWord(s2));
        System.out.println(sol.revWord(s3));
    }
}