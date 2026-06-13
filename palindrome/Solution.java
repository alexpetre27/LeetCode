class Solution{
    public boolean isPalindrome(String s){
        String ss = s.toLowerCase();
        int l=0, r=s.length()-1;
            while(l<r){
                if(ss.charAt(l) != ss.charAt(r))
                    return false;
                l++;
                r--;
            }
            return true;
        
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        String[] s={"Racecar","hello","Ana"};
        System.out.println(sol.isPalindrome(s[0]));
        System.out.println(sol.isPalindrome(s[1]));
        System.out.println(sol.isPalindrome(s[2]));
    }
}