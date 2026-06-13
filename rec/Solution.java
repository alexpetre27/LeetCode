public class Solution{
    public int rec(int n){
        if( n == 0)
            return 1;
        return  n*rec(n-1);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.rec(5));
    }
}