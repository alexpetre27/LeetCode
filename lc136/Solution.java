class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 2, 1};
        System.out.println(solution.singleNumber(nums)); 
    }
}