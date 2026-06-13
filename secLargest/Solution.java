class Solution {
  public int secondLargest(int[] nums) {
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    for (int num : nums) {
        if (num > first) {
            second = first;
            first = num;
        } else if (num > second && num < first) {
            second = num;
        }
    }
    return second == Integer.MIN_VALUE ? -1 : second;
}    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = {1,3,5,5,2};
        int[] nums2 = {5,5,5};
        int[] nums3 = {1,2};
        System.out.println(sol.secondLargest(nums));
        System.out.println(sol.secondLargest(nums2));
        System.out.println(sol.secondLargest(nums3));
    }
}
