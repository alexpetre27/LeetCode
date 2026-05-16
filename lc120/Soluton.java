import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int [] dp = new int[triangle.size()];
        int size = triangle.size();
        for (int i = 0; i < size; i++) 
            dp[i] = triangle.get(size-1).get(i);
        for (int i = size-2; i >= 0; --i) 
            for (int j = 0; j <= i; ++j) 
                dp[j]=triangle.get(i).get(j)+Math.min(dp[j], dp[j+1]);
        return dp[0];
}
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<Integer>> triangle = List.of(
            List.of(2),
            List.of(3,4),
            List.of(6,5,7),
            List.of(4,1,8,3)
        );
        System.out.println(sol.minimumTotal(triangle)); // Output: 11
    }
}