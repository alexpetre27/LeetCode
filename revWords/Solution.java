public class Solution{
    public String reverseWords(String s){
        String[] subs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=subs.length-1;i>=0;i--){
            sb.append(subs[i]);
            if(i!=0)
                sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] s ={"see ya","hello world","ana are mere","java is fun"};
        System.out.println(sol.reverseWords(s[0]));
        System.out.println(sol.reverseWords(s[1]));
        System.out.println(sol.reverseWords(s[2]));
        System.out.println(sol.reverseWords(s[3]));

    }
}