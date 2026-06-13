import java.util.HashSet;

class Solution {
    public boolean twoSum(int[] nums, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(target - num))
                return true;
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {1, 3, 5};
        int[] nums3 = {3, 3};
        System.out.println(sol.twoSum(nums1, 9));  // true
        System.out.println(sol.twoSum(nums2, 10)); // false
        System.out.println(sol.twoSum(nums3, 6));  // true
    }
}